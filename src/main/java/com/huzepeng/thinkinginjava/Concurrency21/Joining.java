package com.huzepeng.thinkinginjava.Concurrency21;

/**
 * @author huzp
 * @date 2018/12/26 0026 15:46
 * @description
 */
public class Joining {
    public static void main(String[] args) {
        Sleeper
//                sleeper = new Sleeper("Sleep",1500),
                grumpy = new Sleeper("Grumpy",1500);
        Joiner
//                dopey = new Joiner("Dopey",sleeper),
                doc = new Joiner("Doc",grumpy);
//        grumpy.interrupt();
    }
}
