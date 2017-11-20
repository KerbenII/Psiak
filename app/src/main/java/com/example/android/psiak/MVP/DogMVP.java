package com.example.android.psiak.MVP;

import com.example.android.psiak.Model.Dog;

/**
 * Created by Grzegorz on 20.11.2017.
 *
 * Simple example of model class in MVP
 */

public class DogMVP {

    private String dogName;
    private String description;

    public DogMVP() {}

    public DogMVP(String dogName, String description) {
        this.dogName = dogName;
        this.description = description;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
