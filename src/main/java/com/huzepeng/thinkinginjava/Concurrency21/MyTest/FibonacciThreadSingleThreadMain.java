package com.huzepeng.thinkinginjava.Concurrency21.MyTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FibonacciThreadSingleThreadMain {



    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 3; i++) {
            executorService.execute(new FibonacciThread(i));
        }

        System.out.println("this is main thread");
        executorService.shutdown();

    }
}
