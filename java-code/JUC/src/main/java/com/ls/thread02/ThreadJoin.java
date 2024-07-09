package com.ls.thread02;

/** 插入线程
 * final synchronized void join(final long millis) 等待该线程终止的时间最长为millis毫秒。
 * final synchronized void join(long millis, int nanos) 等待该线程终止的时间最长为millis毫秒 + nanos纳秒。
 * final void join()
 *  插入线程，在A线程中 执行B.join(),回先执行B线程完毕在，在执行A进程。
 *注意事项
 * 死锁：如果线程A等待线程B，而线程B又在等待线程A（直接或间接地），那么这两个线程就会陷入死锁状态。
 * 性能影响：虽然join方法对于线程同步非常有用，但它也可能导致性能问题，特别是当等待的线程需要很长时间才能完成时。
 * 异常处理：join方法会抛出InterruptedException，因此调用它的代码需要处理这个异常，或者将异常声明在方法签名中。
 * join方法是Java多线程编程中实现线程间同步的一种重要手段，通过合理使用join方法，可以确保线程的执行顺序，从而满足复杂的业务逻辑需求。
 */
public class ThreadJoin extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadJoin t0 = new ThreadJoin();
        t0.start();
        //在main线程中插入
        t0.join();

        //main线程的方法
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
