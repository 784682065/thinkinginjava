package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author huzp
 * @date 2018/12/27 0027 15:32
 * @description
 */
public class CriticalSection  {

    static void testApproaches(Pair.PairManager pman1, Pair.PairManager pman2){
        ExecutorService executorService = Executors.newCachedThreadPool();

        Pair.PairManipulator pm1 = new Pair.PairManipulator(pman1);
        Pair.PairManipulator pm2 = new Pair.PairManipulator(pman2);

        Pair.PairCheck pairCheck1 = new Pair.PairCheck(pman1);
        Pair.PairCheck pairCheck2 = new Pair.PairCheck(pman2);

        executorService.execute(pm1);
        executorService.execute(pm2);
        executorService.execute(pairCheck1);
        executorService.execute(pairCheck2);

        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("pm1: "+pm1 +
                            "pm2: "+pm2 +
                            "pairCheck1: "+pairCheck1 +
                            "pairCheck2: "+pairCheck2);

        System.exit(0);
    }

    public static void main(String[] args) {
//        Pair.PairManager pairManager1= new Pair.PairManager1();
//        Pair.PairManager pairManager2 = new Pair.PairManager2();
//
//        testApproaches(pairManager1,pairManager2);

    }

}
