package com.example.android.psiak.MVP;

import com.example.android.psiak.Model.Dog;

import java.util.List;

/**
 * Created by Grzegorz on 22.11.2017.
 */

public interface Repository {

    List<Dog> getAll();
    Dog findAnimal(String queryString);
    void add(Dog dog);
    boolean remove(Dog dog);
    void removeAll();
}

