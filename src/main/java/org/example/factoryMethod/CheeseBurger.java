package org.example.factoryMethod;

public class CheeseBurger extends Burger {
    public CheeseBurger() {
        name = "Cheese Burger";
        bread = "Regular Bun";
        sauce = "Ketchup";
        toppings.add("Cheese");
    }
}