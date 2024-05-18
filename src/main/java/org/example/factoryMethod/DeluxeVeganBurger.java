package org.example.factoryMethod;

public class DeluxeVeganBurger extends Burger {
    public DeluxeVeganBurger() {
        name = "Deluxe Vegan Burger";
        bread = "Gluten-Free Bun";
        sauce = "Vegan Mayo";
        toppings.add("Lettuce");
        toppings.add("Tomato");
        toppings.add("Avocado");
        toppings.add("Vegan Patty");
    }
}