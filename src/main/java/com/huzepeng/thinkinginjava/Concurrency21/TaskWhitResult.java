package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.Callable;

/**
 * @author huzp
 * @date 2018/12/26 0026 11:20
 * @description
 */
public class TaskWhitResult implements Callable<String> {

    private int id;

    public TaskWhitResult(int id) {
        this.id = id;
    }


    @Override
    public String call() throws Exception {
        return "result of TaskWithResult" + id;
    }

}
