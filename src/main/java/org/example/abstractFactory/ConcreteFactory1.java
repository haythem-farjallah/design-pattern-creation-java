package org.example.abstractFactory;

public class ConcreteFactory1 implements ObstacleFactory {
    @Override
    public Obstacle1 createObstacle1() {
        // For level 1, create a slow obstacle
        return new SlowObstacle1();
    }

    @Override
    public Obstacle2 createObstacle2() {
        // For level 1, create an easy obstacle
        return new EasyObstacle2();
    }
}