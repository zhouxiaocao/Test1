package com.best.singleton;

/**
 * Created by zhouzhihu on 2018/1/17
 * 懒汉式单例（线程安全）
 * 能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，
 * 但是，遗憾的是，效率很低，99%情况下不需要同步。
 */
public class Singleton2 {
    private static Singleton2 INSTANCE = null;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }

}
