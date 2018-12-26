package com.huzepeng.thinkinginjava.Concurrency21.MyTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2123Q1Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            executorService.execute(new Test2122Q1("thread" + i));
        }

        executorService.shutdown();
    }

}
