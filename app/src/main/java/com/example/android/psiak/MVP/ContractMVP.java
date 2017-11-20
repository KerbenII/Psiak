package com.example.android.psiak.MVP;

/**
 * Created by Grzegorz on 20.11.2017.
 * Helps us track the relationship between the View and the Presenter
 */

public interface ContractMVP {

    /**
     * Represents the View (Activity, Fragment, View subclass) in MVP
     */
    interface View {
        void showMessage(String message);
        void showError(String error);
    }

    /**
     * Represents the Presenter in MVP
     */
    interface Presenter {
        void loadMessage();
        void saveName(String name);
    }
}
