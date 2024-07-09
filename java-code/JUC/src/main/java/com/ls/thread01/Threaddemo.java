package com.ls.thread01;

/**
 * 创建线程的第一种方式
 * 1.继承Thread类
 * 2.重写run方法
 * 3.创建线程
 * 4.启动线程
 *
 */
public class Threaddemo extends Thread{
    @Override
    public void run() {
        //编写线程的业务，如打印20次线程的名字
        for(int i = 0; i < 20; i ++){
            System.out.println(("我是"+getName()));
        }

    }

    public static void main(String[] args) {
        Threaddemo t1 = new Threaddemo();
        Threaddemo t2 = new Threaddemo();
//        System.out.println(t1.getName());  Thread-0
//        System.out.println(t2.getName());  Thread-1
        t1.start();
        t2.start();
    }
}
