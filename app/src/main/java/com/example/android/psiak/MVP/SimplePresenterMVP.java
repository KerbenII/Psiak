package com.example.android.psiak.MVP;

/**
 * Created by Grzegorz on 20.11.2017.
 * Concrete implementation for ContractMVP.Presenter
 */

public class SimplePresenterMVP implements ContractMVP.Presenter {

    private DogMVP dogMVP;
    private ContractMVP.View viewMVP;

    public SimplePresenterMVP(ContractMVP.View view) {
        // this is not a good way to create object, but it's
        // only for presentation purposes
        this.dogMVP = new DogMVP();

        // we bind the viewMVP to our presenter
        this.viewMVP = view;
    }

    @Override
    public void loadMessage() {

        if (dogMVP.getDogName() == null) {
            viewMVP.showMessage("There is no dog");
        } else {
            viewMVP.showMessage("Dog's name is " + dogMVP.getDogName());
        }
    }

    @Override
    public void saveName(String name) {
        // in this place we can, for example save data to the database,
        // but for our example we simply set new name for the dog
        dogMVP.setDogName("Reksio");
    }
}
