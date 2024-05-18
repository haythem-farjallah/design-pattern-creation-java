package org.example.abstractFactory;

public class FastObstacle1 implements Obstacle1 {
    @Override
    public int getVelocity() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "This is a fast-moving obstacle.";
    }
}