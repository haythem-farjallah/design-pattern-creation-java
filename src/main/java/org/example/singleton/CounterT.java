package org.example.singleton;

public class CounterT {
    public int count = 0;
    private static CounterT instance = null;
    private static final Object lockObj = new Object();

    private CounterT() {}

    public static CounterT getInstance() {
        synchronized (lockObj) {
            if (instance == null) {
                instance = new CounterT();
            }
        }
        return instance;
    }

    public void addOne() {
        count++;
    }

}
