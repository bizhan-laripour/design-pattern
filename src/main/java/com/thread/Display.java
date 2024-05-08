package com.thread;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Display {

    private ReentrantLock lock = new ReentrantLock();

    public  void display(String name){


        for(int i=0 ; i<=10 ; i++) {
            if(lock.tryLock()){
            System.out.print("hello :");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
            lock.unlock();
        }else{
                System.out.println("i cant get the lock");
            }

        }

    }
}
