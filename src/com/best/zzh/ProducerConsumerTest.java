package com.best.zzh;

/**
 * Created by BG276137 on 2017/12/28
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Object lock = new Object();
        final Producer producer = new Producer(lock);
        final Consumer consumer = new Consumer(lock);

        Runnable producerRunnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    producer.setValue();
                }
            }
        };
        Runnable consumerRunnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    consumer.getValue();
                }
            }
        };
        Thread producerThread = new Thread(producerRunnable);
        Thread consumerThread = new Thread(consumerRunnable);
        producerThread.start();
        consumerThread.start();
    }
}
