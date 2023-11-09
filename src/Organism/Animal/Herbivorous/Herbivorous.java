package Organism.Animal.Herbivorous;

import Organism.Animal.Animal;

public abstract class Herbivorous extends Animal {
    public Herbivorous(int weight, int countPerCell, int speedMax, double foodWeight) {
        super(weight, countPerCell, speedMax, foodWeight);
    }
}
