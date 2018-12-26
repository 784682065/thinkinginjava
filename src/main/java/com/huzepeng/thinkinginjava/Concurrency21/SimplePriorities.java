package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author huzp
 * @date 2018/12/26 0026 13:12
 * @description 没有达到书中所说的
 */
public class SimplePriorities implements Runnable {

    private int countDown = 5;
    private volatile double d;
    private int priority;

    public SimplePriorities(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + ":" + countDown;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
            System.out.println(this);
            if(--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new SimplePriorities(Thread.MIN_PRIORITY));
        }
        executorService.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        executorService.shutdown();
    }

}
