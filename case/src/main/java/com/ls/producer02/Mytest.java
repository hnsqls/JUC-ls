package com.ls.producer02;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 利用阻塞队列实现生产者消费者问题
 */
public class Mytest {
    public static void main(String[] args) {
        //有界阻塞队列。设置大小为1.即桌子上一次只能放一个
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        Cook cook = new Cook();
        Foodie foodie = new Foodie();
        cook.setBlockingQueue(queue);
        foodie.setBlockingQueue(queue);

        cook.start();
        foodie.start();

    }


}
