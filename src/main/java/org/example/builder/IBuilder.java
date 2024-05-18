package org.example.builder;

public interface IBuilder {
    void startUpOperations();
    void buildBody();
    void insertWheels();
    void addHeadlights();
    void endOperations();
    Product getVehicle();
}
