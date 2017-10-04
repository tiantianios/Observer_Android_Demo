package com.example.tianxiuping.observer_android_demo.Observer;

/**
 * Created by tianxiuping on 2017/10/3.
 */

public class SpecificObservable extends MyObservable {

    private String title = null;

    public void setTitle(String title){

        this.title = title;
    }

    public void push(){

        if (this.title != null){

            notifyObservers(this.title);
        }

    }

}
