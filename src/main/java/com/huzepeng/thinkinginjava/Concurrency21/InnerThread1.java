package com.huzepeng.thinkinginjava.Concurrency21;

/**
 * @author huzp
 * @date 2018/12/26 0026 14:48
 * @description
 */
public class InnerThread1 {
    private int countDown = 5 ;
    private Inner inner;

    private class Inner extends Thread{

        public Inner(String name) {
            super(name);
            start();
        }

        public  void run(){
            try {
                while(true){
                    System.out.println(this);
                    if(--countDown == 0) return;
                    sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return getName()+ ":" +countDown;
        }
    }

    public InnerThread1(String name) {
        this.inner = new Inner(name);
    }
}
