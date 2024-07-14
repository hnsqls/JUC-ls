package com.ls.test.test02;

/**
 * 有1000份礼物，两人同时发送，礼物剩下小于10份的时候就不在送。要求利用多线程模拟，并打印出线程的名字和礼物的剩余数量、
 */
public class GiftThread implements Runnable{
    private  int gift = 1000;
    @Override
    public void run() {
        while (true){
            synchronized (Runnable.class){
                if(gift < 10){
                    break;
                }else {
                    gift --;
                    System.out.println(Thread.currentThread().getName()+"送出一份礼物还剩"+gift+"份礼物");
                }
            }
        }
    }
}
