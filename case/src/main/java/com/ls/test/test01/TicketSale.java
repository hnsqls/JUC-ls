package com.ls.test.test01;

/**
 * 	一共1000张电影票，两个窗口领取，每次领取时间为3000ms，要求用多线程模拟买票过程并打印剩余电影票数量。
 */
public class TicketSale extends Thread{
    private  static  int ticket = 1000;
    @Override
    public void run() {
        while (true){
            synchronized (Thread.class){
                if(ticket > 0){
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+"卖出一张票还剩" + ticket + "张票");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                } else {
                    break;
                }

            }
        }
    }
}
