package com.ls.test.test02;

public class MyTest {
    public static void main(String[] args) {
        GiftThread giftThread =new GiftThread();
       Thread t0 =  new Thread(giftThread);
       Thread t1 = new Thread(giftThread);
       t0.start();
       t1.start();

    }
}
