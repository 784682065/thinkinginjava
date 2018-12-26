package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.TimeUnit;

/**
 * @author huzp
 * @date 2018/12/26 0026 14:29
 * @description
 */
public class ADeamon implements Runnable{
    @Override
    public void run() {

        try {
            System.out.println("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("when main is quit,its quit");
        }
    }

}
