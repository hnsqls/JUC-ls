package com.ls.ticket03;

public class MyTest {
    public static void main(String[] args) {
        Ticket03Thread t0 = new Ticket03Thread();
        Ticket03Thread t1 = new Ticket03Thread();
        Ticket03Thread t2 = new Ticket03Thread();
        t0.setName("窗口1");
        t1.setName("窗口2");
        t2.setName("窗口3");

        t1.start();
        t2.start();
        t0.start();
    }
}
