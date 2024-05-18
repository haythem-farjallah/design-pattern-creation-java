package org.example.factoryMethod;

public class VeganBurger extends Burger {
    public VeganBurger() {
        name = "Vegan Burger";
        bread = "Whole Grain Bun";
        sauce = "Mustard";
        toppings.add("Lettuce");
        toppings.add("Tomato");
        toppings.add("Vegan Patty");
    }
}