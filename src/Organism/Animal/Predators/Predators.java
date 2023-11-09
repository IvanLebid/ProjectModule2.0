package Organism.Animal.Predators;

import Organism.Animal.Animal;

public abstract class Predators extends Animal {
    public Predators(int weight, int countPerCell, int speedMax, double foodWeight) {
        super(weight, countPerCell, speedMax, foodWeight);
    }
}
