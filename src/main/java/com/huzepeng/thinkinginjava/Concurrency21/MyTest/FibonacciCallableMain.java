package com.huzepeng.thinkinginjava.Concurrency21.MyTest;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author huzp
 * @date 2018/12/26 0026 11:29
 * @description
 */
public class FibonacciCallableMain {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        ArrayList<Future<Integer>> futures = new ArrayList<>();


        for (int i = 1; i < 4; i++) {
            FibonacciCallable fibonacciCallable = new FibonacciCallable(i);
            Future<Integer> submit = executorService.submit(fibonacciCallable);
            System.out.println("是否完成 " + submit.isDone());
            futures.add(submit);
        }

        for (Future<Integer> f : futures) {
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
