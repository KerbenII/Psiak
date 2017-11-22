package com.example.android.psiak.MVP;

/**
 * Created by Grzegorz on 22.11.2017.
 */

public abstract class BasePresenter<T> {

    public T view;

    public void attach(T view) {
        this.view = view;
    }

    public void detach() {
        this.view = null;
    }

    public boolean isViewAttached(){
        return this.view == null;
    }
}
