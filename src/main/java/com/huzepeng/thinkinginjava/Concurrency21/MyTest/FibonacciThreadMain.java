package com.huzepeng.thinkinginjava.Concurrency21.MyTest;

public class FibonacciThreadMain {



    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            new Thread(new FibonacciThread(i)).start();
        }

    }
}
