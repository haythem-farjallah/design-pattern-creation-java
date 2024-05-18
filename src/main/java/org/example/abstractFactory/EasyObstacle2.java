package org.example.abstractFactory;

public class EasyObstacle2 implements Obstacle2 {
    @Override
    public String getDifficulty() {
        return "easy";
    }

    @Override
    public String getDescription() {
        return "This is an easy obstacle to overcome.";
    }

    @Override
    public int getDamage() {
        return 10; // Low damage
    }
}