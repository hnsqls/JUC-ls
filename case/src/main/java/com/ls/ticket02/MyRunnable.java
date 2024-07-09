package com.ls.ticket02;

import com.ls.ticket.TicketThread;

/**
 * 三个窗口买1000张票
 * 同步方法
 */
public class MyRunnable implements Runnable {
    int ticket = 0;
    @Override
    public void run() {
        while (true){
            if (extracted()) break;
        }
    }

    private  synchronized boolean extracted() {
        if (ticket <1000){
            ticket++;
            System.out.println(TicketThread.currentThread().getName()+ "卖了票号为" + ticket+"的票！");

        }else {
            return true;
        }
        return false;
    }
}
