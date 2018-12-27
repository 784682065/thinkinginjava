package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author huzp
 * @date 2018/12/27 0027 9:57
 * @description
 */
public class EvenChecker implements Runnable {

    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator generator, int id) {
        this.generator = generator;
        this.id = id;
    }

    @Override
    public void run() {

        while(!generator.isCanceled()){
            int val = generator.next();
            if(val % 2 != 0){
                System.out.println(val + "not even");
                generator.cancel();
            }
        }
    }

    public static void test(IntGenerator generator, int count) {
        System.out.println("Press Control-C to exit");
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i <count ; i++) {
            executorService.execute(new EvenChecker(generator,i));
        }
        executorService.shutdown();
    }

    public static void test(IntGenerator generator) {
           test(generator,10);
    }

}
