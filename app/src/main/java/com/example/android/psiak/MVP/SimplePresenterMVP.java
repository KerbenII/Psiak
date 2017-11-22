package com.example.android.psiak.MVP;

import com.example.android.psiak.Model.Dog;

import java.util.List;

/**
 * Created by Grzegorz on 20.11.2017.
 * Concrete implementation for ContractMVP.Presenter
 */

public class SimplePresenterMVP extends BasePresenter<ContractMVP.View> implements ContractMVP.Presenter {

    private Repository repository;
    private ContractMVP.View viewMVP;

    public SimplePresenterMVP(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void showAllDogs() {
        List<Dog> dogs = repository.getAll();
        String dogsNamesList = "";
        for (Dog dog : dogs) {
            dogsNamesList.concat(" " + " \n" + Dog.getName());
        }
        viewMVP.showAllDogsNames(dogsNamesList);
    }

    @Override
    public void addDog(Dog dog) {
        repository.add(dog);
    }
}
