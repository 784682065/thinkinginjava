package com.huzepeng.thinkinginjava.Concurrency21;

/**
 * @author huzp
 * @date 2018/12/26 0026 14:19
 * @description
 */
public class Daemon implements Runnable {

    private Thread[] t = new Thread[10];

    @Override
    public void run() {

        for (int i = 0; i <t.length ; i++) {
            t[i] =new Thread(new DaemonSpawn());
            t[i].start();
            System.out.println("DaemonSpawn " + i + "started");
        }

        for (int i = 0; i <t.length ; i++) {
            System.out.println("t["+i+"].isDaemon() ="+
                    t[i].isDaemon() + ".");
        }
        while (true)
            Thread.yield();

    }

    class DaemonSpawn implements  Runnable{

        @Override
        public void run() {
            while (true){
                Thread.yield();
            }
        }
    }

}
