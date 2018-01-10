package com.best.zzh;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by BG276137 on 2017/12/28
 */
public class QueueTest {
    public static void main(String[] args) {
        final BlockingQueue<String> bq = new ArrayBlockingQueue<String>(10);
        Runnable producerRunnable = new Runnable() {
            int i = 0;

            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("生产前容器大小：" + bq.size());
                        System.out.println("我生产了一个" + i++);
                        bq.put(i + "");
                        System.out.println("生产后容器大小：" + bq.size());
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable customerRunnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("消费前容器大小：" + bq.size());
                        System.out.println("我消费了一个" + bq.take());
                        System.out.println("消费后容器大小：" + bq.size());
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread producerThread = new Thread(producerRunnable);
        Thread customerThread = new Thread(customerRunnable);
        producerThread.start();
        customerThread.start();
    }
}
