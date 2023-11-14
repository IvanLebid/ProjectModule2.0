package Organism.Animal.Herbivorous;

import Organism.Animal.Animal;

public abstract class Herbivorous extends Animal {
    public Herbivorous(int weight, int countPerCell, int speedMax, double FOOD_WEIGHT, double famine) {
        super(weight, countPerCell, speedMax, FOOD_WEIGHT, famine);
    }

}
