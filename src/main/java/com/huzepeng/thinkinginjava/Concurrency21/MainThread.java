package com.huzepeng.thinkinginjava.Concurrency21;

/**
 * 继承与runnable,她必须有run()方法,但是这个方法并无特殊之处,他不会产生任何线程能力,
 * 如果要想产生线程能力,则必须要显示的附着于 thread之上
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch  = new LiftOff();
        launch.run();
    }
}
