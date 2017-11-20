package com.example.android.psiak.MVP;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.psiak.R;

import butterknife.BindView;
import butterknife.OnClick;

public class MVPActivity extends AppCompatActivity implements ContractMVP.View {

    /**
     * Here we store our presenter object
     */
    private ContractMVP.Presenter presenterMVP;

    @BindView(R.id.mvp_tv_example_message)
    TextView tvMessage;
    @BindView(R.id.mvp_et_dog_name)
    EditText etDogsName;
    @BindView(R.id.mvp_btn_show_message)
    Button btnShowMessage;
    @BindView(R.id.mvp_btn_save_name)
    Button btnSaveDogsName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // set our presenter
        presenterMVP = new SimplePresenterMVP(this);

    }

    @Override
    public void showMessage(String message) {
        tvMessage.setText(message);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();
    }

    /**
     * The View should be passive and only receives user's action
     * and leaves all remaining tasks for the Presenter
     */
    @OnClick(R.id.mvp_btn_show_message)
    void showDogsName() {
        presenterMVP.loadMessage();
    }

    @OnClick(R.id.mvp_btn_save_name)
    void saveDogsName() {
        presenterMVP.saveName(etDogsName.getText().toString());
    }
}
