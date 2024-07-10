package com.ls.producer;

/** 厨师
 *  1.判断桌子上有没有食物
 *  2.没有食物，就做，做完通知吃货（因为吃货因为桌子上没有食物还在等待着）
 *  3.有食物，就等待着。（等待吃货告知没有食物）
 *
 */
public class Producer extends Thread{
    @Override
    public void run() {
        while (true){
            if(Desk.cont < 10){
                synchronized (Desk.obj){
//                    System.out.println("厨师来了");
                    if(Desk.foodFlag == 0 ){ //如果没有食物
                        System.out.println("厨师做食物");
                        Desk.foodFlag = 1;
                        //唤醒处于等待状态的吃货
                        Desk.obj.notifyAll();
                    }else { //如果有食物
                        try {
//                            System.out.println("生产者等待，让出锁和cpu");
                            Desk.obj.wait();//让出锁和cpu，让吃货拿到。
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

            }else {
                break;
            }

        }

    }
}
