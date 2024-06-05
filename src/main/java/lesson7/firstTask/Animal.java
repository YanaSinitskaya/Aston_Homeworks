package lesson7.firstTask;

public class Animal {
    public static int countAnimals = 0;

    public Animal() {
        countAnimals++;
    }

    public void run(int distance) {

    }

    public void swim(int distance) {
        System.out.println("Плывет " + distance);
    }
}
