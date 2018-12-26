package com.huzepeng.thinkinginjava.Concurrency21;

/**
 * @author huzp
 * @date 2018/12/26 0026 14:31
 * @description
 */
public class DaemonsDontRunFinally {

    public static void main(String[] args) {
        Thread t = new Thread(new ADeamon());
//        t.setDaemon(true);
        t.start();
    }
}
