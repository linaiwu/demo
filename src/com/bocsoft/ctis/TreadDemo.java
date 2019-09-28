package com.bocsoft.ctis;

public class TreadDemo {

    public static void main(String[] args) {
        System.out.println("-------------Thread-------------");

        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.start();
        t2.start();

    }
}
class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("-----" + i);
        }
    }
}