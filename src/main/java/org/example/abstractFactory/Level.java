package org.example.abstractFactory;

public class Level {
    private ObstacleFactory factory;

    public Level(ObstacleFactory factory) {
        this.factory = factory;
    }

    public void createObstacles() {
        Obstacle1 obstacle1 = factory.createObstacle1();
        Obstacle2 obstacle2 = factory.createObstacle2();

        System.out.println("Obstacle 1 Description: " + obstacle1.getDescription());
        System.out.println("Obstacle 1 Velocity: " + obstacle1.getVelocity());
        System.out.println("Obstacle 2 Description: " + obstacle2.getDescription());
        System.out.println("Obstacle 2 Difficulty: " + obstacle2.getDifficulty());
        System.out.println("Obstacle 2 Damage: " + obstacle2.getDamage());
    }
}