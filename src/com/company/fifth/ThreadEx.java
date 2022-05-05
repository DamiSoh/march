package com.company.fifth;

public class ThreadEx {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadFirst threadFirst = new ThreadFirst();
        threadFirst.setPriority(2);
        System.out.println("Thread First Priority  " + threadFirst.getPriority());
        System.out.println("Main Thread Priority " + Thread.currentThread().getPriority());
        threadFirst.start();

        for (int i=0; i < 300; i++){
            System.out.printf("%s", new String("="));
        }
        System.out.println();
        System.out.print("소요시간 2: " + (System.currentTimeMillis() - ThreadEx.startTime));


    }
}

class ThreadFirst extends Thread{
    public void run(){
        for (int i=0; i < 300; i++){
            System.out.printf("%s", new String("|"));
        }
        System.out.println();
        System.out.print("소요시간 1: " + (System.currentTimeMillis() - ThreadEx.startTime));
    }
}