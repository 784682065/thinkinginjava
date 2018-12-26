package com.huzepeng.thinkinginjava.Concurrency21.MyTest;

import java.util.concurrent.Callable;

public class FibonacciCallable implements Callable<Integer> {

    private int n ;

    public FibonacciCallable(int n) {
        this.n = n;
    }


    public static int fib(int num) {
        //判断：是否是第一个数和第二个数
        if(num == 1 || num == 2) {
            return 1;
        }else {
            //循环调用本函数
            return fib(num - 2) + fib(num - 1);
        }
    }

    @Override
    public Integer call() throws Exception {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum=sum+fib(i);
        }
        return sum;
    }
}
