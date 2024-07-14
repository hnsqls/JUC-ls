package com.ls.test.test03;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 同时开启两个线程，共同获取1~100之前的所有数字。要求输出所有的奇数。
 */
public class OddNum implements Runnable {
    private int num = 1;
    ReentrantLock s1 = new ReentrantLock();

    @Override
    public void run() {

            while (true) {
                //101
                s1.lock();
                try {
                    if (num <=10) {
                        if (num % 2 != 0) {
                            System.out.println(Thread.currentThread().getName() + ": " + num);
                        }
                        num++;
//                        s1.unlock();
                    } else {
                        break;
                    }
                } finally {
                    s1.unlock();
                }
            }
        }
    }
