package org.example.abstractFactory;

public class ConcreteFactory2 implements ObstacleFactory {
    @Override
    public Obstacle1 createObstacle1() {
        // For level 2, create a fast obstacle
        return new FastObstacle1();
    }

    @Override
    public Obstacle2 createObstacle2() {
        // For level 2, create a hard obstacle
        return new HardObstacle2();
    }
}