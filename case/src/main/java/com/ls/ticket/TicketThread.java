package com.ls.ticket;

/**
 * 三个窗口买100张，电影票
 */
public class TicketThread extends Thread {

    /*
    静态变量（Static Variable）：
    静态变量是在程序执行期间仅被初始化一次的变量。无论声明它的代码块被执行多少次，静态变量都只会被初始化一次。
    静态变量的生命周期贯穿整个程序运行期间，而不是局限于它们被声明的代码块。
    在类（Class）中声明的静态变量是该类的所有实例共享的。即，无论创建多少个类的实例，这些实例都访问同一个静态变量。`````
     */
    static int ticket = 1;

    //锁对象，一定要是唯一的
//    static Object obj = new Object();  可以换为该类的字节码

    @Override
    public void run() {
        while (true) {
            //同步代码块，一次只能有一个线程执行锁里面的代码
            synchronized (TicketThread.class) {
                if (ticket < 10000) {
                    try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                    ticket++;
                    System.out.println(getName() + "卖出票号为" + ticket + "的电影票");
                } else {
                    break;
                }
            }
        }
    }
}
