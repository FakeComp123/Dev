package com.fakeapp;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private boolean connected = false;
    private Map<String, String> data = new HashMap<>();

    // === Seventh fake secret ===
    private String MONGO_URI = "mongodb://user:fakepass@localhost:27017/test";

    public void connect() {
        connected = true;
        System.out.println("Connected to Mongo at " + MONGO_URI);
    }

    public void disconnect() {
        connected = false;
        System.out.println("Disconnected from DB.");
    }

    public void insert(String key, String value) {
        data.put(key, value);
        System.out.println("Inserted: " + key + " => " + value);
    }

    public String query(String key) {
        String value = data.get(key);
        System.out.println("Queried " + key + " => " + value);
        return value;
    }

    // Noise function
    public void backupRestore() {
        System.out.println("Backing up " + data.size() + " records");
        System.out.println("Restoring records...");
    }
}
