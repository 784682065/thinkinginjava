package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author huzp
 * @date 2018/12/27 0027 14:39
 * @description
 */
public class SerialNumberChecker {

    private static final  int SIZE = 10;
    private static CircularSet serials = new CircularSet(1000);

    private static ExecutorService executorService  = Executors.newCachedThreadPool();

    static class SerialChecker implements Runnable{

        @Override
        public void run() {
            while (true){
                int serial = SerialNumberGenerator.nextSerialNumber();
                if (serials.contains(serial)){
                    System.out.println("Duplicate: " +serial);
                    System.exit(0);
                }
                serials.add(serial);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < SIZE ; i++) {
            executorService.execute(new SerialChecker());
        }

        if(args.length > 0){
            TimeUnit.SECONDS.sleep(new Integer(args[0]));
            System.out.println("no duplicates detected");
            System.exit(0);
        }

    }

}
