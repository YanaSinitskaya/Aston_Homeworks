package lesson13;

import lesson13.task2.PhoneBook;

import java.util.*;

public class Lesson13_Main {
    public static void main(String[] args) {
        System.out.println("---------- Exercises - 1 ----------");
        String[] arrayWords = {"кафель", "пол", "обои", "тесто", "цвет", "бутылка", "розы", "собака", "зарядка", "микрофон", "зарядка", "цвет"};
        List<String> list = Arrays.asList(arrayWords);
        Set<String> uniqueWords = new HashSet<>(list);
        System.out.println(uniqueWords);
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : list) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }
        System.out.printf("Слово\tКоличество вхождений%n");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.printf("%s\t%d%n", entry.getKey(), entry.getValue());
        }

        System.out.println("---------- Exercises - 2 ----------");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Анисимов", "1234");
        phoneBook.add("Морозов", "4321");
        phoneBook.add("Анисимов", "2143");
        phoneBook.add("Зайцев", "4322");

        System.out.println("Номера под фамилией Анисимов: " + phoneBook.get("Анисимов"));
        System.out.println("Номера под фамилией Морозов: " + phoneBook.get("Морозов"));
        System.out.println("Номера под фамилией Зайцев: " + phoneBook.get("Зайцев"));
        System.out.println("Номера под фамилией Еремин: " + phoneBook.get("Еремин"));
    }
}

