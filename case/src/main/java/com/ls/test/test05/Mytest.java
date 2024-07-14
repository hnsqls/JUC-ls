package com.ls.test.test05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Mytest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,100,500,800,2,80,300,700);
        Thread t0 = new Moneybox(list);
        Thread t1 = new Moneybox(list);
        t0.setName("箱子一");
        t1.setName("箱子二");
        t0.start();
        t1.start();
    }
}
