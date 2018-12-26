package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.TimeUnit;

/**
 * @author huzp
 * @date 2018/12/26 0026 14:24
 * @description
 */
public class Daemons {
    public static void main(String[] args) throws InterruptedException {

        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        System.out.println("d.isDaemon() =" +d.isDaemon());

        TimeUnit.SECONDS.sleep(1);
    }
}
