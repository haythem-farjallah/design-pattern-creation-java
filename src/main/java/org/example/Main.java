package org.example;

import org.example.abstractFactory.ConcreteFactory1;
import org.example.abstractFactory.ConcreteFactory2;
import org.example.abstractFactory.Level;
import org.example.abstractFactory.ObstacleFactory;
import org.example.builder.Car;
import org.example.builder.Director;
import org.example.builder.IBuilder;
import org.example.builder.Product;
import org.example.factoryMethod.*;
import org.example.prototype.Circle;
import org.example.prototype.Rectangle;
import org.example.prototype.Shape;
import org.example.singleton.Counter;
import org.example.singleton.CounterT;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // counter
        Counter counter1 = Counter.getInstance();
        Counter counter2 = Counter.getInstance();

        counter1.addOne();
        counter2.addOne();

        System.out.println("Counter 1: " + counter1.count);
        System.out.println("Counter 2: " + counter2.count);

        counter1.addOne();

        System.out.println("Counter 1: " + counter1.count);
        System.out.println("Counter 2: " + counter2.count);

        //Counter with threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            CounterT counterT1 = CounterT.getInstance();
            counterT1.addOne();
            System.out.println("Counter 1: " + counterT1.count);
        };

        Runnable task2 = () -> {
            CounterT counterT2 = CounterT.getInstance();
            counterT2.addOne();
            System.out.println("Counter 2: " + counterT2.count);
        };

        executor.execute(task1);
        executor.execute(task2);

        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        // PROTOTYPE
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.color = "red";

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";

        List<Shape> shapesList = new ArrayList<>();
        shapesList.add(circle);
        shapesList.add(rectangle);

        Circle circleCopy = (Circle) circle.clone();
        Rectangle rectangleCopy = (Rectangle) rectangle.clone();

        List<Shape> shapesCopyList = new ArrayList<>();
        for (Shape shape : shapesList) {
            shapesCopyList.add(shape.clone());
        }
        //BUILDER
        IBuilder carBuilder = new Car("Toyota");
        Director director = new Director();
        director.construct(carBuilder);

        Product car = carBuilder.getVehicle();
        System.out.println(car.show());

        // Method factory
        BurgerStore cheeseBurgerStore = new CheeseBurgerStore();
        BurgerStore veganBurgerStore = new VeganBurgerStore();

        Burger burger1 = cheeseBurgerStore.orderBurger(Burgers.CHEESE);
        System.out.println("Ordered a " + burger1.getName() + "\n");

        Burger burger2 = veganBurgerStore.orderBurger(Burgers.DELUXEVEGAN);
        System.out.println("Ordered a " + burger2.getName() + "\n");

        //Abstract factory
        int level = 1; // Assume Level 1

        ObstacleFactory factory;
        if (level == 1) {
            factory = new ConcreteFactory1();
        } else if (level == 2) {
            factory = new ConcreteFactory2();
        } else {
            throw new IllegalArgumentException("Invalid level: " + level);
        }

        Level levelInstance = new Level(factory);
        levelInstance.createObstacles();
    }

}
