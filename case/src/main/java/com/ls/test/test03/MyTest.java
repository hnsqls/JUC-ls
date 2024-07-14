package com.ls.test.test03;

public class MyTest {
    public static void main(String[] args) {
        OddNum oddNum = new OddNum();
        Thread t0 = new Thread(oddNum,"线程1");
        Thread t1 = new Thread(oddNum,"线程2");
        t0.start();
        t1.start();


    }
}
