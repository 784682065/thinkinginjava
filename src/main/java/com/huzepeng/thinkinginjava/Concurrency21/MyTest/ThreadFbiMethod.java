package com.huzepeng.thinkinginjava.Concurrency21.MyTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author huzp
 * @date 2018/12/26 0026 15:09
 * @description
 */
public class ThreadFbiMethod {

    private int countDown = 5;
    private Future<Integer> submit;
    private String name;

    
    
    public ThreadFbiMethod(String name) {
        this.name = name;
    }

    public  int fib(int num) {
        //判断：是否是第一个数和第二个数
        if(num == 1 || num == 2) {
            return 1;
        }else {
            //循环调用本函数
            return fib(num - 2) + fib(num - 1);
        }
    }

    public Future<Integer> runTask(int num){

        if(submit == null){
            FibonacciCallable fibonacciCallable  = new FibonacciCallable(num);
            ExecutorService executorService = Executors.newCachedThreadPool();

            submit= executorService.submit(fibonacciCallable);
            executorService.shutdown();
        }
        return submit;
    }

}
