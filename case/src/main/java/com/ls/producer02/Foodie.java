package com.ls.producer02;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 生产者
 */
public class Foodie extends Thread {
    //只做10次
    private  int count = 0;
    private ArrayBlockingQueue blockingQueue;

    public ArrayBlockingQueue getBlockingQueue() {
        return blockingQueue;
    }

    public void setBlockingQueue(ArrayBlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        while (true){
            if(count < 10){
                try {
                    blockingQueue.put("面条");
                    count++;
                    System.out.println("做面");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else {
                break;
            }

        }


    }
}
