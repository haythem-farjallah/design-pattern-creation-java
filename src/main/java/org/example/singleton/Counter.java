package org.example.singleton;

public class Counter {
    public int count = 0;
    private static Counter instance = null;

    private Counter() {}

    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }

    public void addOne() {
        count++;
    }
}
