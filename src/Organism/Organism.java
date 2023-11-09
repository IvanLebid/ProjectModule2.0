package Organism;

public abstract class Organism {
    public int weight;
    public int countPerCell;

    public Organism(int weight, int countPerCell) {
        this.weight = weight;
        this.countPerCell = countPerCell;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getCountPerCell() {
        return this.countPerCell;
    }

    public void setCountPerCell(int countPerCell) {
        this.countPerCell = countPerCell;
    }

    public void reproduce() {
    }

    public void die() {
    }
}
