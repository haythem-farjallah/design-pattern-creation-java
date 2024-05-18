package org.example.abstractFactory;

public class SlowObstacle1 implements Obstacle1 {
    @Override
    public int getVelocity() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "This is a slow-moving obstacle.";
    }
}