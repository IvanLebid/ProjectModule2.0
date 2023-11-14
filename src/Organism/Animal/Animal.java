package Organism.Animal;

import Organism.Organism;

public abstract class Animal extends Organism {

    public int speedMax;
    public double famine;
    public double FOOD_WEIGHT;


    public Animal(int weight, int countPerCell, int speedMax, double FOOD_WEIGHT, double famine) {
        super(weight, countPerCell);
        this.speedMax = speedMax;
        this.FOOD_WEIGHT = FOOD_WEIGHT;
        this.famine = famine;
    }

    public int getSpeedMax() {
        return this.speedMax;
    }

    public double getFoodWeight() {
        return this.FOOD_WEIGHT;
    }

    public void eat( Organism food) {
        food.setCountPerCell(food.countPerCell - 1);
        if(food.weight >= FOOD_WEIGHT){
            famine = FOOD_WEIGHT;
        }else {
            famine += food.weight;
        }

    }

    public void move() {
    }
}
