package com.wipro.threadcontrol;

public class HandsOnAssignment2 {

    public static void main(String[] args) {

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
            }
        });

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
            }
        });

        evenThread.start();

        try {
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        oddThread.start();
    }
}