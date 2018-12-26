package com.huzepeng.thinkinginjava.Concurrency21.MyTest;

public class Test2122Q1 implements Runnable{

    private String content;

    public Test2122Q1(String content) {
        this.content = content;
    }

    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {
            System.out.println(content);
            Thread.yield();
        }
    }
}
