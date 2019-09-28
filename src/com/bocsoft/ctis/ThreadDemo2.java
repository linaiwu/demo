package com.bocsoft.ctis;

public class ThreadDemo2 {

    public static void main(String[] args) {

        MyThread2 mt2 =new MyThread2();
        Thread t1 = new Thread(mt2,"t1");
        Thread t2 = new Thread(mt2,"t2");
        t1.start();
        t2.start();

    }
}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"--------"+i);
        }
    }
}
