package com.best.singleton;

/**
 * Created by zhouzhihu on 2018/1/17
 * 饿汉式单例(变种)
 * 在类初始化即实例化instance。（类构造器）
 */
public class Singleton4 {
    private static Singleton4 INSTANCE = null;

    static {
        INSTANCE = new Singleton4();
    }

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return INSTANCE;
    }
}
