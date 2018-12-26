package com.huzepeng.thinkinginjava.Concurrency21.MyTest;

public class Test2122Q1Main {

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            new Thread(new Test2122Q1("thread"+i)).start();
        }
    }

}
