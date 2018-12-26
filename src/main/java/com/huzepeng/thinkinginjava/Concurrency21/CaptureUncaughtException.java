package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author huzp
 * @date 2018/12/26 0026 16:05
 * @description
 */
public class CaptureUncaughtException {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool(
                new HandlerThreadFactory()
        );
        executorService.execute(new ExceptionThread());
    }

}
