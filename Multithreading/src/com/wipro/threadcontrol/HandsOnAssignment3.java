package com.wipro.threadcontrol;

public class HandsOnAssignment3 {

    public static void main(String[] args) {

        Thread maxThread = new Thread(() -> {
            System.out.println("MAX priority thread is running");
        });

        Thread minThread = new Thread(() -> {
            System.out.println("MIN priority thread is running");
        });

        Thread normThread = new Thread(() -> {
            System.out.println("NORM priority thread is running");
        });

        maxThread.setPriority(Thread.MAX_PRIORITY);
        minThread.setPriority(Thread.MIN_PRIORITY);
        normThread.setPriority(Thread.NORM_PRIORITY);

        maxThread.start();
        minThread.start();
        normThread.start();
    }
}