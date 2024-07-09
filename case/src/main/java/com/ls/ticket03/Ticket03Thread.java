package com.ls.ticket03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * lock锁
 * lock时接口选择实现ReentrantLock
 */
public class Ticket03Thread extends Thread {
    static int ticket = 0;
    //确保锁的唯一性
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {

            lock.lock();
            try {
                if (ticket < 1000) {
                    ticket++;
                    System.out.println(getName() + "买票号为" + ticket + "的票");
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
