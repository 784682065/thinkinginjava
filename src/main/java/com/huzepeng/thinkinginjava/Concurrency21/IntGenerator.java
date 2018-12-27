package com.huzepeng.thinkinginjava.Concurrency21;

/**
 * @author huzp
 * @date 2018/12/27 0027 9:53
 * @description
 */
public abstract class IntGenerator {

    private volatile  boolean canceled = false;

    public abstract  int next();

    public  void cancel(){
        canceled =true;
    }

    public  boolean isCanceled(){
        return canceled;
    }
}
