package org.example.builder;

public class Car implements IBuilder {
    private String brandName;
    private Product product;

    public Car(String brand) {
        product = new Product();
        this.brandName = brand;
    }

    @Override
    public void startUpOperations() {
        product.add("Car Model name: " + this.brandName);
    }

    @Override
    public void buildBody() {
        product.add("Body of car was added");
    }

    @Override
    public void insertWheels() {
        product.add("Wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("Headlights are added");
    }

    @Override
    public void endOperations() {
        // End of car creation operations
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}