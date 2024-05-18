package org.example.builder;

public class Director {
    IBuilder builder;

    // Steps to create complex object
    public void construct(IBuilder builder) {
        this.builder = builder;
        builder.startUpOperations();
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
        builder.endOperations();
    }
}