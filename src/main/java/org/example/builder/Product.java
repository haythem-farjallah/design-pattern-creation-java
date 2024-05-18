package org.example.builder;

import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public String show() {
        StringBuilder productDetails = new StringBuilder();
        for (String part : parts) {
            productDetails.append(part).append("\n");
        }
        return productDetails.toString();
    }
}
