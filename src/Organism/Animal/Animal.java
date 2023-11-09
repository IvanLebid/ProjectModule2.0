package Organism.Animal;

import Organism.Organism;

public abstract class Animal extends Organism {
    public int speedMax;
    public double foodWeight;

    public Animal(int weight, int countPerCell, int speedMax, double foodWeight) {
        super(weight, countPerCell);
        this.speedMax = speedMax;
        this.foodWeight = foodWeight;
    }

    public int getSpeedMax() {
        return this.speedMax;
    }

    public double getFoodWeight() {
        return this.foodWeight;
    }

    public void eat(Organism food) {
        food.setCountPerCell(food.countPerCell - 1);
    }

    public void move() {
    }
}
