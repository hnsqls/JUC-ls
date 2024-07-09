package com.ls.ticket;

/**
 * 同步代码块
 */
public class MyTest {
    public static void main(String[] args) {
        TicketThread t0 = new TicketThread();
        TicketThread t1 = new TicketThread();
        TicketThread t2 = new TicketThread();
        t0.setName("窗口1");
        t1.setName("窗口2");
        t2.setName("窗口3");

        t0.start();
        t1.start();
        t2.start();
    }
}
