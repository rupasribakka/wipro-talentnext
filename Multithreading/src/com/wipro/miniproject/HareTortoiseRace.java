package com.wipro.miniproject;

public class HareTortoiseRace {

    public static void main(String[] args) {

    	Runnable hareTask = () -> {

    	    for (int distance = 1; distance <= 100; distance++) {

    	        System.out.println(
    	            Thread.currentThread().getName()
    	            + " covered: " + distance + " meters"
    	        );

    	        if (distance == 60) {
    	            try {
    	                Thread.sleep(1000);
    	            } catch (InterruptedException e) {
    	                e.printStackTrace();
    	            }
    	        }
    	    }

    	    System.out.println("Hare finished the race!");
    	};
        Runnable tortoiseTask = () -> {

            for (int distance = 1; distance <= 100; distance++) {

                System.out.println(
                    Thread.currentThread().getName()
                    + " covered: " + distance + " meters"
                );
            }

            System.out.println("Tortoise finished the race!");
        };

        Thread hare = new Thread(hareTask, "Hare");
        Thread tortoise = new Thread(tortoiseTask, "Tortoise");

        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}