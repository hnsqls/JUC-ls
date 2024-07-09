package com.ls.thread02;

/**
 * 被礼让的线程
 */
public class ThreadYield1  extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("坦克");
        }
    }
}
