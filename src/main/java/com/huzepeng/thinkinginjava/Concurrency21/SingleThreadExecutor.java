package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author huzp
 * @date 2018/12/26 0026 11:12
 * @description
 *  SingleThreadExecutor 就像是线程数量为1的FixedThreadPool
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //任务可以保证一个一个运行
        for (int i = 0; i < 5 ; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
    }
}
