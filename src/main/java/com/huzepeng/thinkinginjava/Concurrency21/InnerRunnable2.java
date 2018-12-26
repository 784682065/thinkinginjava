package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.TimeUnit;

/**
 * @author huzp
 * @date 2018/12/26 0026 15:05
 * @description
 */
public class InnerRunnable2 {

    private int countDown =5;
    private Thread t;
    public InnerRunnable2(String name){
        t = new Thread(() -> {
            try{
                while (true){
                    System.out.println(this);
                    if(--countDown == 0) return;
                    TimeUnit.MILLISECONDS.sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },name);
    }


}
