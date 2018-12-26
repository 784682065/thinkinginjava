package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.TimeUnit;

/**
 * @author huzp
 * @date 2018/12/26 0026 13:37
 * @description
 */
public class SimpleDaemons implements Runnable {


    @Override
    public void run() {

        try {

            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + "  "+this);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("all is started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
