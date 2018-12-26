package com.huzepeng.thinkinginjava.Concurrency21;

import java.util.concurrent.*;

/**
 * @author huzp
 * @date 2018/12/26 0026 14:15
 * @description
 */
public class DaemonThreadPoolExecutor extends ThreadPoolExecutor {
    public DaemonThreadPoolExecutor() {
        super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>(), new DaemonThreadFactory());
    }
}
