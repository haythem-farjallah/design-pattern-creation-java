package org.example.factoryMethod;

public class DeluxeCheeseBurger extends Burger {
    public DeluxeCheeseBurger() {
        name = "Deluxe Cheese Burger";
        bread = "Sesame Bun";
        sauce = "Special Sauce";
        toppings.add("Cheese");
        toppings.add("Lettuce");
        toppings.add("Tomato");
    }
}