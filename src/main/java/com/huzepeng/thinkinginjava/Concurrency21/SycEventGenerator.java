package com.huzepeng.thinkinginjava.Concurrency21;

/**
 * @author huzp
 * @date 2018/12/27 0027 10:53
 * @description
 */
public class SycEventGenerator extends  IntGenerator {
    private int currentEvenValue = 0;

    @Override
    public  synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SycEventGenerator());
    }

}
