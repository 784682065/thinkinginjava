package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.ThreadFactory;

/**
 * @author huzp
 * @date 2018/12/26 0026 13:43
 * @description
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread();
        return t;
    }
}
