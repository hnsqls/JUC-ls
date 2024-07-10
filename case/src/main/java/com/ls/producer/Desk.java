package com.ls.producer;

public class Desk {
    //0表示 无   1表示有
    static int foodFlag = 0;
    //锁对象
    static  Object obj= new Object();

    //消费者最多吃10碗
    static int  cont = 0;
}
