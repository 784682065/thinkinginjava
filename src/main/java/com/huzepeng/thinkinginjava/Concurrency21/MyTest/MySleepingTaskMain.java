package com.huzepeng.thinkinginjava.Concurrency21.MyTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author huzp
 * @date 2018/12/26 0026 11:50
 * @description
 */
public class MySleepingTaskMain {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 3; i++) {
            executorService.execute(new MySleepingTask());
        }

        executorService.shutdown();

    }

}
