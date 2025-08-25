package com.fakeapp;

import java.util.Random;

public class Services {

    private Random rand = new Random();

    // === Eighth fake secret ===
    public String AWS_SESSION_TOKEN = "FwoGZXIvYXdzEFAaDJFAKESESSIONTOKEN1234567890";

    public void performTask() {
        System.out.println("Performing service task...");
        for (int i = 0; i < 50; i++) {
            int val = rand.nextInt(1000);
            if (i % 10 == 0) System.out.println("Task checkpoint " + i + ": " + val);
        }
    }

    // Noise function
    public void simulateTraffic() {
        for (int i = 0; i < 50; i++) {
            int load = (i * rand.nextInt(10)) % 17;
            if (i % 5 == 0) System.out.println("Traffic sim " + i + " -> " + load);
        }
    }
}
