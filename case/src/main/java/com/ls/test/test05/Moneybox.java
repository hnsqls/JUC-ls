package com.ls.test.test05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 一个抽奖池 ： {10,5,20,100,500,800,2,80,300,700}
 * 两个抽奖箱子：抽奖箱1，抽奖箱2
 */
public class Moneybox extends Thread {

    //共享抽奖池，并且何以改变----》传参构造
    ArrayList<Integer> list;

    public Moneybox(ArrayList<Integer> list) {
        this.list = list;
    }
    /**
     * 抽奖逻辑
     * 在抽奖池中随机一个数，然后这个数就移除抽奖池
     */
    @Override
    public void run() {
        while (true){
            synchronized (Moneybox.class){
                if (list.size() != 0){
                    //随机
                    Collections.shuffle(list);
                    Integer remove = list.remove(0);
                    System.out.println(getName()+"产出了"+ remove + "元");
                }
                else {
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
