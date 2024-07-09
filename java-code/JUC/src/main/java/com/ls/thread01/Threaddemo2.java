package com.ls.thread01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现线程的第三种方式
 *      z
 * 利用 Callable接口和 Future 接口方式 实现
 *      这种方式可以获取线程的返回结果，前两种的返回值都是void。
 * 1.自定义类实现Callable接口 ,指定返回的类型给泛型，重写Call方法（业务）
 * 2.创建自定义类对象
 * 2.创建FutureTask 对象（管理call的返回结果）
 */
public class Threaddemo2 implements Callable<Integer> {
    /**
     * 1到100的和
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Threaddemo2 threaddemo2 = new Threaddemo2();
        FutureTask<Integer> ft = new FutureTask<>(threaddemo2);
        Thread t1 = new Thread(ft);
        t1.start();
        Integer i = ft.get();
        System.out.println(i);


    }
}
