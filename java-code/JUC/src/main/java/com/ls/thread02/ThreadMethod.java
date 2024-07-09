package com.ls.thread02;

/**
 * 1.线程优先级 setPriority(x)
 *      线程默认 优先级都是5
 *      main线程优先级也是5
 *      1~10 优先级依次增高
 *
 */
public class ThreadMethod extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                ThreadMethod.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(ThreadMethod.currentThread()+"执行");
        }
    }

    public static void main(String[] args) {
        ThreadMethod t0 = new ThreadMethod();
        ThreadMethod t1 = new ThreadMethod();
        t0.setPriority(5);
        t1.setPriority(10);

        //t0进程先到cpu
        t0.start();
        //t1线程后到cpu
        t1.start();

        /*
         执行结果会是什么样子？
         先执行t1的一条输出语句（在t2输出的时候cpu是空闲的），cpu转而执行线程t1。
         所以就出现了交替执行的情况
         线程的优先级只是获得cpu的概率更高。

         */
    }
}


