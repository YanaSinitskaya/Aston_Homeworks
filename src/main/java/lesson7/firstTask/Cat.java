package lesson7.firstTask;

public class Cat extends Animal {
    public static int countCats = 0;
    public boolean satiety = false;
    public static int kibbleBowl = 30;

    public Cat() {
        super();
        countCats++;
    }

    @Override
    public void run(int distance) {
        if (distance < 200) {
            System.out.println("Кот бежит " + distance + " м.");
        } else System.out.println("Кот не может бежать больше 200 м.");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не плавает");
    }

    public void eat(int wantToEatQuantity) {
        if (kibbleBowl >= wantToEatQuantity) {
            satiety = true;
            kibbleBowl -= wantToEatQuantity;
        }
    }

    public void addKibble(int add) {
        kibbleBowl += add;
    }
}
