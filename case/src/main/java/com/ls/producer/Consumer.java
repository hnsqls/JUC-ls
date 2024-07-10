package com.ls.producer;

import javax.crypto.spec.PSource;

/**
 * 吃货
 *  1.吃货获取到cpu
 *  2.判断桌子上有没有食物
 *  3.如果没有 就wait，等待厨师喊他。
 *  4.如果有就吃，吃完通知厨师在做。
 */
public class Consumer extends Thread {

    @Override
    public void run() {
        while (true){
            synchronized (Desk.obj){
//                System.out.println("吃货来了");
                if(Desk.cont < 10){
                    if(Desk.foodFlag == 1){
                        Desk.cont++;
                        System.out.println("吃货吃饭-" + Desk.cont);

                        Desk.foodFlag = 0;
                        //唤醒厨师
                        Desk.obj.notifyAll();
                    }else {
                        try {
                            //等待厨师做，就是让出cpu执行。 wait()会立刻释放锁，并让线程处于等待状态。
                            //这样厨师就能拿到锁，和cpu的使用
//                            System.out.println("吃货等待，让出cpu和锁");
                            Desk.obj.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }else {
                    break;
                }
            }
        }
    }
}
