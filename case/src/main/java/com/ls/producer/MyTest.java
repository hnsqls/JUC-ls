package com.ls.producer;

/**
 * Producer-Consumer 生产者消费者问题
 *      一个吃货，一个厨师，一个桌子。 吃货吃10碗面 厨师做10碗面
 *
 */
public class MyTest {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        Producer producer = new Producer();
        consumer.start();
        producer.start();
    }
}
