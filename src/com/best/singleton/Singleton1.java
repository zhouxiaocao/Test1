package com.best.singleton;

/**
 * Created by zhouzhihu on 2018/1/17
 * 懒汉式单例(线程不安全)
 * lazy loading很明显，但是致命的是在多线程不能正常工作。
 */
public class Singleton1 {
    private static Singleton1 INSTANCE = null;
    private Singleton1(){}

    public static Singleton1 getInstance(){
        if(INSTANCE==null){
            INSTANCE=new Singleton1();
        }
        return INSTANCE;
    }

}
