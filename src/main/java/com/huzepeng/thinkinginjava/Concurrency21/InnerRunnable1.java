package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.TimeUnit;

/**
 * @author huzp
 * @date 2018/12/26 0026 14:59
 * @description
 */
public class InnerRunnable1 {

    private int countDown =5;
    private Inner inner;
    private class  Inner implements Runnable{
        Thread t ;
        Inner (String name ){
            t = new Thread(this , name);
            t.start();
        }

        @Override
        public void run() {
            try{
                while(true){
                    System.out.println(this);
                    if(--countDown == 0){
                        return;
                    }
                    TimeUnit.MILLISECONDS.sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return t.getName() +" : "+countDown;
        }
    }

    public InnerRunnable1(String  name) {
        inner = new Inner(name);
    }
}
