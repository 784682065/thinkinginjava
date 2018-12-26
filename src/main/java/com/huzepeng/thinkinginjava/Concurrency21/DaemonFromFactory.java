package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author huzp
 * @date 2018/12/26 0026 13:44
 * @description
 */
public class DaemonFromFactory implements Runnable {
    @Override
    public void run() {
        try {
           while (true){
               TimeUnit.MILLISECONDS.sleep(100);
               System.out.println(Thread.currentThread() + "" +this);
           }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool(
                new DaemonThreadFactory()
        );

        for (int i = 0; i < 10; i++) {
            executorService.execute(new DaemonFromFactory());
        }

        System.out.println("all daemon are started");

        TimeUnit.MILLISECONDS.sleep(100000);
    }
}
