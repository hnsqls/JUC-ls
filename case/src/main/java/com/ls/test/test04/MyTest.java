package com.ls.test.test04;

public class MyTest {
    public static void main(String[] args) {
        RedPacket redPacket = new RedPacket();
        Thread t0 = new Thread(redPacket,"小红");
        Thread t1 = new Thread(redPacket,"小明");
        Thread t2 = new Thread(redPacket,"小李");
        Thread t3 = new Thread(redPacket,"小黄");
        Thread t4 = new Thread(redPacket,"小虎");

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
