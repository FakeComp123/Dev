package com.fakeapp;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class MainApp {

    // === First fake secret ===
    public static final String AWS_ACCESS_KEY = "AKIAFAKE1234567890FAKE";

    // === Second fake secret ===
    public static final String DB_PASSWORD = "P@ssw0rd123!";

    public static void printBanner() {
        System.out.println("====================================");
        System.out.println("       Welcome to Fake Java App");
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        printBanner();

        Config cfg = new Config();
        System.out.println("Config summary: " + cfg);

        Utils utils = new Utils();
        List<String> users = utils.generateUsers(10);
        utils.processUsers(users);

        Database db = new Database();
        db.connect();
        db.insert("user1", "value1");
        db.query("user1");
        db.disconnect();

        Services service = new Services();
        service.performTask();

        // Noise loops
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) System.out.println("Main loop checkpoint: " + i);
        }

        System.out.println("All tasks finished.");
    }
}
