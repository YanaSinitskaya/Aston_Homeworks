package lesson7.firstTask;

public class Dog extends Animal {
    public static int countDogs = 0;

    public Dog() {
        super();
        countDogs++;
    }

    @Override
    public void run(int distance) {
        if (distance < 500) {
            System.out.println("Собака бежит " + distance + " м.");
        } else System.out.println("Собака не может бежать больше 500 м.");
    }

    @Override
    public void swim(int distance) {
        if (distance < 10) {
            System.out.println("Собака плывет " + distance + " м.");
        } else System.out.println("Собака не может плыть больше 10 м.");
    }
}
