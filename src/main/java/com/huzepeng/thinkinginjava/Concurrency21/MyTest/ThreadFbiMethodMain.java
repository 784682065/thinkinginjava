package com.huzepeng.thinkinginjava.Concurrency21.MyTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author huzp
 * @date 2018/12/26 0026 15:28
 * @description
 */
public class ThreadFbiMethodMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<Integer> threadFbiMethod = new ThreadFbiMethod("ThreadFbiMethod").runTask(3);
        Integer integer = threadFbiMethod.get();
        System.out.println(integer);
    }

}
