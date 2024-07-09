package com.ls.thread02;

/**
 * 守护线程  final void setDaemon(boolean on)
 *    当非守护线程结束，守护线程就没有存在的必要，后续也会结束（可能不是执行到最后）
 *
 */
public class ThreadDaemon  extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + i);
        }
    }

    public static void main(String[] args) {
        //非守护进程 t0
        ThreadDeamon1 t0 = new ThreadDeamon1();
        t0.setName("女神");

        //守护进程 t1
        ThreadDaemon t1 = new ThreadDaemon();
        t1.setName("备胎");
        t1.setDaemon(true);

        t0.start();
        t1.start();

        /* 运行结果是什么样子的？
        非守护进程结束后，守护进程随着结束。但是并不是立刻结束的。
        守护进程没有执行完。

         */
    }
}



