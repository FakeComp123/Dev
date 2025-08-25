package com.fakeapp;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Utils {

    private Random rand = new Random();

    // === Fifth fake secret ===
    public String TWILIO_TOKEN = "fAkeAuThT0ken1234567890abcdef";

    public List<String> generateUsers(int n) {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            users.add("user" + i);
        }
        return users;
    }

    public void processUsers(List<String> users) {
        for (String u : users) {
            System.out.println("Processing user: " + u);
            try { Thread.sleep(5); } catch (InterruptedException e) {}
        }
    }

    // Noise function
    public List<Integer> fillerMath() {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            results.add((i * i) % 13);
        }
        return results;
    }

    // === Sixth fake secret ===
    public String SLACK_WEBHOOK = "https://hooks.slack.com/services/T00000000/B00000000/XXXXXXXXXXXXXXXXXXXXXXXX";

}
