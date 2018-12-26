package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * FixedThreadPool 使用了有限的线程集来执行所提交的任务
 * cachedThreadPool 在程序执行过程中通常会创建与所需数量相同的线程,然后在他回收旧线程时停止创建新线程
 */
public class FixedThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i <5 ; i++) {
            executorService.execute(new LiftOff());
        }

        executorService.shutdown();
    }

}
