package com.ls.thread01;

/**
 * 创建线程的第二种方式
 * 1.自定义类实现Runnable类
 * 2.重写run方法
 * 3.创建自定义类
 * 4.创建Thread类 并传参，参数是自定义类  现在才是线程
 * 5.启动线程
 *
 */
public class Threaddemo1 implements  Runnable {
    @Override
    public void run() {
        //该线程业务
        //打印20次该线程的名字
        /*
        由于该类是继承Runnable类Runnable还不是线程，需要将该类作为参数给Thread类，才能成为线程
        要先获取线程的名字，要先获得线程。
        * */
        Thread thread = Thread.currentThread();
        for(int i = 0; i < 20; i ++){
            System.out.println("我是"+thread.getName());
        }
    }

    public static void main(String[] args) {
        Threaddemo1 threaddemo1 = new Threaddemo1();
        Thread t1 = new Thread(threaddemo1);
        Thread t2 = new Thread(threaddemo1);
        t1.start();
        t2.start();
    }
}
