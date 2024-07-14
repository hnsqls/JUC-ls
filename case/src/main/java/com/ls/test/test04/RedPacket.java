package com.ls.test.test04;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

/**
 * 100块，3个红包，5个人抢，其中5个人是5条线程，打印如下：
 *
 * xxxx抢到了XXX元
 * 	xxxx抢到了xxx元
 * xxxx抢到了xxx元
 *xxxx没抢到
 * xxxx没抢到
 * 逻辑实现，100块，3个红包，5个人抢。
 * 从100块来说被分的总和是100。
 * 结合3个红包来说，3个红包都是随机的Random，每次随机红包最小不能低于0.01，最高不能低于总和 -（剩余红包个数*0.01）。但是最后一次不是随机的，因为要确保总和一致。所以第三次的分配的金额是总和减去前两次和。
 * 结合5个人，红包个数抢完l，剩余两个人就没抢到。
 */

public class RedPacket implements Runnable {
    private double total = 100;
    private int count = 3;
    private  double money = 0;
    private  double MIN = 0.01;
    private  int person = 5;
    @Override
    public void run() {

            synchronized (Runnable.class){
                if(count >= 2){
                    Random r = new Random();
                    double bounds = total - (count - 1) * MIN;
                    money = r.nextDouble(bounds);
                    if (money == 0){
                        money = MIN;
                    }
                    System.out.println(Thread.currentThread().getName() + "抢到" + money+"元");
                    total = total - money;
                    count--;
                    person--;
                }else if (count ==1){
                    money = total;
                    System.out.println(Thread.currentThread().getName() + "抢到" + money+"元");
                    count --;
                    total = 0;
                    person--;

                } else if (count ==0 && person!=0 ) {
                    System.out.println(Thread.currentThread().getName() + "没抢到红包");
                    person--;

                }
            }
        }
}
