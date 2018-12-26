package com.huzepeng.thinkinginjava.Concurrency21;

/**
 * @author huzp
 * @date 2018/12/26 0026 16:03
 * @description
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("catch  " +e);
    }
}
