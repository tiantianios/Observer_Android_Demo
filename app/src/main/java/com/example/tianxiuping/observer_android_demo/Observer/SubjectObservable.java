package com.example.tianxiuping.observer_android_demo.Observer;

/**
 * Created by tianxiuping on 2017/10/4.
 */

public interface SubjectObservable {

    //注册观察者
    public void addObserver(MyObserva o);
    //取消观察者
    public void cancelObserver(MyObserva o);

    //取消所有观察者

    public void cancelAllObservers();
    //获得所有观察者数量
    public int countObservers();


    //发送通知
    public void notifyObservers(String msg);
}
