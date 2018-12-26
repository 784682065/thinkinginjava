package com.huzepeng.thinkinginjava.Concurrency21;

/**
 * @author huzp
 * @date 2018/12/26 0026 16:01
 * @description
 */
public class ExceptionThread2 implements Runnable {



    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run() by" +t);
        System.out.println("eh=" +
                t.getUncaughtExceptionHandler());
        throw  new RuntimeException();
    }
}
