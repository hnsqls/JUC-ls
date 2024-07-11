package com.ls.producer02;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 消费者
 */
public class Cook  extends Thread{
    //只吃10次
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
            if(count <10){
                try {
                    blockingQueue.take();
                    count++;
                    System.out.println("吃面");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else {
                break;
            }
        }

    }
}
