package com.wipro.threadcreation;

import java.util.Random;

public class HandsOnAssignment2 implements Runnable {

    @Override
    public void run() {

        String[] colours = {
            "white", "blue", "black", "green", "red", "yellow"
        };

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);
            String colour = colours[index];

            System.out.println("Colour: " + colour);

            if (colour.equals("red")) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        HandsOnAssignment2 obj = new HandsOnAssignment2();

        Thread thread = new Thread(obj);

        thread.start();
    }
}
