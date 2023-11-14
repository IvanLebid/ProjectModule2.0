package Organism.Animal.Predators;

import Organism.Animal.Animal;

public abstract class Predators extends Animal {

    public Predators(int weight, int countPerCell, int speedMax, double FOOD_WEIGHT, double famine) {
        super(weight, countPerCell, speedMax, FOOD_WEIGHT, famine);
    }
}
