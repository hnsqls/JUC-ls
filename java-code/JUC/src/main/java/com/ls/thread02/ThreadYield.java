package com.ls.thread02;

/**  礼让线程/出让线程
 *      public static native void yield();
 *      线程让出cpu的控制权
 *      礼让不是绝对的，获得cpu后，礼让其他线程，但是当cpu重新分配的时候还是有机会分配到礼让线程。
 *      非强制性：Thread.yield()方法的调用是建议性的，并不保证当前线程会立即放弃CPU资源。因此，它不能用于实现严格的线程同步或控制线程的执行顺序。
 *      状态不变：线程在调用Thread.yield()方法后，其状态不会发生变化，仍然是就绪状态。这意味着它仍然有资格参与CPU资源的竞争。
 *      使用场景：Thread.yield()方法通常用于那些对执行顺序要求不高的场景，或者当线程发现自己无法继续执行（如等待某个资源）时，主动让出CPU资源以提高系统的整体性能
 *
 */
public class ThreadYield extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {

            System.out.println("飞机");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        ThreadYield t0 = new ThreadYield();
        ThreadYield1 t1 = new ThreadYield1();
        t0.setName("飞机");
        t1.setName("大炮");


        t0.start();
        t1.start();
    }
}
