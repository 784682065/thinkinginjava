package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.ThreadFactory;

/**
 * @author huzp
 * @date 2018/12/26 0026 16:03
 * @description
 */
public class HandlerThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        System.out.println(this + "creating new thread");
        Thread t = new Thread(r);
        System.out.println("created" +t);
        t.setUncaughtExceptionHandler(
                new MyUncaughtExceptionHandler());
        return t;
    }
}
