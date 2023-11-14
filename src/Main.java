import Organism.Animal.Herbivorous.Rabbit;
import Organism.Plant.Grass;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Hello world!");
        Rabbit bunny = new Rabbit(random.nextInt(2) + 1, random.nextInt(0, 150),
                random.nextInt(2) + 1, 0.45, random.nextDouble(0, 0.45));

        System.out.println("Кролика bunny з характеристиками:\nweight: " + bunny.weight + "\t countPerCell: " +
                bunny.countPerCell + "\tspeedMax: " + bunny.speedMax + "\tFOOD_WEIGHT: " + bunny.FOOD_WEIGHT +
                "\tfamine: " + bunny.famine + "\nстворено!");

        Grass grass = new Grass(1, random.nextInt(0, 200));
        System.out.println("\nТраву з характеристиками: \nweight: " + grass.weight + "\tcountPerCell: " +
                grass.countPerCell + "\nстворено!");

        System.out.println("\nвиклик методу eat");
        bunny.eat(grass);
        System.out.println("bunny з характеристиками:\nweight: " + bunny.weight + "\t countPerCell: " +
                bunny.countPerCell + "\tspeedMax: " + bunny.speedMax + "\tFOOD_WEIGHT: " + bunny.FOOD_WEIGHT +
                "\tfamine: " + bunny.famine);

        System.out.println("\nТрава з характеристиками: \nweight: " + grass.weight + "\tcountPerCell: " + grass.countPerCell);
    }
}