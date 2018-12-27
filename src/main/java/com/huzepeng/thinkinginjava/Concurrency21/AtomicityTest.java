package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author huzp
 * @date 2018/12/27 0027 14:27
 * @description
 */
public class AtomicityTest implements  Runnable{

    private AtomicInteger i = new AtomicInteger(0);
    public  int getValue(){return i.get();}
    private   void evenIncrement(){ i.addAndGet(2);}

    @Override
    public void run() {
        while (true){
            evenIncrement();
        }
    }

    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.err.println("Aborting");
                System.exit(0);
            }
        },5000);


        ExecutorService executorService = Executors.newCachedThreadPool();
        AtomicityTest atomicityTest = new AtomicityTest();
        executorService.execute(atomicityTest);
        while(true){
            int val = atomicityTest.getValue();
            if(val % 2 !=0){
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
