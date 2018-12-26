package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author huzp
 * @date 2018/12/26 0026 15:59
 * @description
 */
public class ExceptionThread implements Runnable {
    @Override
    public void run() {
        throw  new RuntimeException();
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new ExceptionThread());
    }
}
