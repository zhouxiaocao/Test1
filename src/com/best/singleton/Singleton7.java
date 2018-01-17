package com.best.singleton;

/**
 * Created by zhouzhihu on 2018/1/17
 * 双重检测锁实现单例模式
 */
public class Singleton7 {
    /**
     * 添加volatile，禁止指令重排序
     */
    private static volatile Singleton7 INSTANCE = null;

    private Singleton7() {
    }

    public static Singleton7 getInstance() {
        //此处可能会重排序（因为没有数据依赖）
        if (INSTANCE == null) {
            synchronized (Singleton7.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton7();
                }
            }
        }
        return INSTANCE;
    }
}
