package org.example.abstractFactory;

public class HardObstacle2 implements Obstacle2 {
    @Override
    public String getDifficulty() {
        return "hard";
    }

    @Override
    public String getDescription() {
        return "This is a hard obstacle to overcome.";
    }

    @Override
    public int getDamage() {
        return 30; // High damage
    }
}