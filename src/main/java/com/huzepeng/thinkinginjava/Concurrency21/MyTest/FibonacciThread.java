package com.huzepeng.thinkinginjava.Concurrency21.MyTest;

public class FibonacciThread implements Runnable{

    private int n ;



    public FibonacciThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n ; i++) {
            System.out.println("Thread:"+n + "   fbi:" +fib(i));
        }

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
}
