package lesson7;

import lesson7.firstTask.Animal;
import lesson7.firstTask.Cat;
import lesson7.firstTask.Dog;
import lesson7.secondTask.Circle;
import lesson7.secondTask.Rectangle;
import lesson7.secondTask.Triangle;

import java.util.Random;

import static lesson7.firstTask.Animal.countAnimals;
import static lesson7.firstTask.Cat.countCats;
import static lesson7.firstTask.Cat.kibbleBowl;
import static lesson7.firstTask.Dog.countDogs;

public class Lesson7_Main {
    public static void main(String[] args) {
        System.out.println("Первое задание");
        Animal dogBoris = new Dog();
        Animal catMotya = new Cat();
        Cat[] arrayOfCats = new Cat[4];
        arrayOfCats[0] = new Cat();
        arrayOfCats[1] = new Cat();
        arrayOfCats[2] = new Cat();
        arrayOfCats[3] = new Cat();

        dogBoris.run(100);
        dogBoris.swim(5);

        catMotya.run(1);
        catMotya.swim(5);

        System.out.println("Общее количество собак: " + countDogs);
        System.out.println("Общее количество котов: " + countCats);
        System.out.println("Всего животных: " + countAnimals);

        for (Cat arrayOfCat : arrayOfCats) {
            Random r = new Random();
            int wantToEatRandom = r.nextInt(30) + 1;
            System.out.println("В миске " + kibbleBowl + "гр. Кот хочет съесть " + wantToEatRandom + "гр.");
            arrayOfCat.eat(wantToEatRandom);
            System.out.println("Сытость " + arrayOfCat.satiety);
        }

        System.out.println("\nВторое задание");
        Circle circle = new Circle(6);
        circle.setFillColor("Зеленый");
        circle.setBorderColor("Красный");
        circle.printCharacteristic();

        Rectangle rectangle = new Rectangle(4, 9);
        rectangle.setFillColor("Черный");
        rectangle.setBorderColor("Желтый");
        rectangle.printCharacteristic();

        Triangle triangle = new Triangle(9, 5, 7);
        triangle.setFillColor("Зеленый");
        triangle.setBorderColor("Серый");
        triangle.printCharacteristic();
    }
}
