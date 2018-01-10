package com.best.zzh;

/**
 * Created by BG276137 on 2017/12/28
 */
public class Consumer {
    private Object lock;
    public Consumer(Object lock){
        this.lock=lock;
    }

    public void getValue(){
        try {
            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }
                System.out.println("Get的值是：" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
