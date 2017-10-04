package com.example.tianxiuping.observer_android_demo.Observer;

import java.util.ArrayList;

/**
 * Created by tianxiuping on 2017/10/4.
 */

public class MyObservable implements SubjectObservable {


    public ArrayList<MyObserva> obs = new ArrayList<MyObserva>();
    //注册观察者
    @Override
    public void addObserver(MyObserva o){

        obs.add(o);

    }
    //取消观察者
    @Override
    public void cancelObserver(MyObserva o) {

        if (obs.indexOf(o) >= 0)
        {
            obs.remove(o);
        }
        // obs.remove(o);
    }

    //取消所有观察者
    @Override
    public void cancelAllObservers() {

        obs.clear();

    }

    //获得所有观察者数量
    @Override
    public int countObservers() {

        return obs.size();
    }


    //发送通知
    @Override
    public void notifyObservers(String msg) {

        for (MyObserva o:obs
                ) {
           o.updata(this,msg);
        }
    }

}
