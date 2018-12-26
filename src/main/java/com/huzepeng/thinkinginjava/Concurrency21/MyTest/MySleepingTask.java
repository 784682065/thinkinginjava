package com.huzepeng.thinkinginjava.Concurrency21.MyTest;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author huzp
 * @date 2018/12/26 0026 11:46
 * @description
 */
public class MySleepingTask implements Runnable{

    @Override
    public void run() {
        Random  random = new Random();
        int i = random.nextInt(10);
        try {
            System.out.println(i*1000);
            TimeUnit.MILLISECONDS.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
