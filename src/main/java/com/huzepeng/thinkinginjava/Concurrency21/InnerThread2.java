package com.huzepeng.thinkinginjava.Concurrency21;

/**
 * @author huzp
 * @date 2018/12/26 0026 14:52
 * @description
 */
public class InnerThread2 {

    private  int countDown = 5;
    private Thread thread;

    public InnerThread2(String name) {
        thread = new Thread(name){
            public void run(){
                try {
                    while (true){
                        System.out.println(this);
                        if(--countDown == 0) return;
                        sleep(10);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            public String toString(){
                return getName()+" : " + countDown;
            }
        };
        thread.start();
    }
}
