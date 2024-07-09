package com.ls.ticket02;

public class Mytest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t0 = new Thread(myRunnable);
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        t0.setName("窗口1");
        t1.setName("窗口2");
        t2.setName("窗口3");


        t0.start();
        t1.start();
        t2.start();
    }
}
