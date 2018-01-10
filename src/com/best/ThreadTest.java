package com.best;

/**
 * Created by BG276137 on 2017/12/29
 */
public class ThreadTest {
    public static void main(String[] args){
        int i=0;
        try {
            while (true) {
                i++;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName());
                    }
                }).start();
            }
        }catch (Exception e){
            System.out.println(i);
        }
    }
}
