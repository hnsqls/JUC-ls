package com.ls.test.test01;

public class Mytest {
    public static void main(String[] args) {
        TicketSale t0 = new TicketSale();
        TicketSale t1 = new TicketSale();
        t0.setName("窗口一");
        t1.setName("窗口二");
        t0.start();
        t1.start();

    }
}
