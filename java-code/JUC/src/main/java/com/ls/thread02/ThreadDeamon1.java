package com.ls.thread02;

/**
 * 作为非守护线程
 */
public class ThreadDeamon1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "执行了" + i + "次");
        }
    }
}
