package org.example.factoryMethod;

import java.util.ArrayList;

public abstract class Burger {
    String name;
    String bread;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        // Preparation steps
    }

    void cook() {
        // Cooking steps
    }

    void serve() {
        // Serving steps
    }

    public String getName() {
        return name;
    }
}