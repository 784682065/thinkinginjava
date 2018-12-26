package com.huzepeng.thinkinginjava.Concurrency21;

/**
 * @author huzp
 * @date 2018/12/26 0026 14:33
 * @description
 */
public class SimpleThread  extends Thread{

    private int countDown = 5;
    private static  int threadCount=0;

    public SimpleThread() {
        super(Integer.toString(++threadCount));
        start();
    }

    public String toString (){
        return "#"+getName() +"("+ countDown+")";
    }

    public void run(){
        while (true){
            System.out.println(this);
            if(--countDown == 0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SimpleThread();
        }
    }

}
