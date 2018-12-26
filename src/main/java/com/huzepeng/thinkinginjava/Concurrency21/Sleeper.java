package com.huzepeng.thinkinginjava.Concurrency21;

/**
 * @author huzp
 * @date 2018/12/26 0026 15:37
 * @description
 */
public class Sleeper extends Thread {

    private int duration;

    public Sleeper(String name , int sleepTime){
        super(name);
        duration = sleepTime;
        start();
    }

    public void run(){
        try{
            sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + "has awakened");
    }

}
