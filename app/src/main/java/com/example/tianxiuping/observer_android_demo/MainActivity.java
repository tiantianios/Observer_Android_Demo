package com.example.tianxiuping.observer_android_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tianxiuping.observer_android_demo.Observer.MyObservable;
import com.example.tianxiuping.observer_android_demo.Observer.SpecificObservable;
import com.example.tianxiuping.observer_android_demo.Observer.SpecificObserver1;
import com.example.tianxiuping.observer_android_demo.Observer.SpecificObserver2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        demo1();

    }

public void  demo1(){

    MyObservable obs = new MyObservable();

    SpecificObserver1  sp1 = new SpecificObserver1();
    SpecificObserver2   sp2 = new SpecificObserver2();
    obs.addObserver(sp1);
    obs.addObserver(sp2);

    obs.notifyObservers("发送通知");


}
}
