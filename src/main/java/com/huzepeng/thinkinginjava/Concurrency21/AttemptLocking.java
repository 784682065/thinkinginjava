package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author huzp
 * @date 2018/12/27 0027 11:11
 * @description
 */
public class AttemptLocking {
    private ReentrantLock lock = new ReentrantLock();
    public void untimed(){
        boolean captured = lock.tryLock();

        try {
            System.out.println("trylock(): "+captured);
        }finally {
            if(captured){
                lock.unlock();
            }
        }
    }

    public void timed(){
        boolean captured =false;

        try {
            captured = lock.tryLock(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try{
            System.out.println("tryLock(2, TimeUnit.SECONDS) : " + captured);
        }finally {
            if(captured){
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final AttemptLocking al = new AttemptLocking();
        al.untimed();
        al.timed();
        final CountDownLatch latch = new CountDownLatch(1);//1.增加一个"屏障"

        new Thread(){
            {setDaemon(true);}
            public void run(){
                al.lock.lock();
                System.out.println("acquired");
                latch.countDown();
            }
        }.start();

        latch.await();
        al.untimed();
        al.timed();

    }


}
