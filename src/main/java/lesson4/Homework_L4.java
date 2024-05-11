package lesson4;

import java.util.Arrays;

public class Homework_L4 {

    public void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public void checkSumSign() {
        int a = 10;
        int b = -45;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");

        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public void compareNumbers() {
        int a = 88;
        int b = 399;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public boolean checkSumRange(int a, int b) {
        int sum = a + b;

        return sum >= 10 && sum <= 20;
    }

    public String checkPositiveOrNegativeString(int a) {
        if (a >= 0) {
            return "Положительное";
        }
        return "Отрицательное";
    }

    public boolean checkPositiveOrNegativeBoolean(int a) {
        return a >= 0;
    }

    public void writePhraseNTimes(String phrase, int quanitty) {
        for (int i = 0; i < quanitty ; i++) {
            System.out.println(phrase);
        }
    }

    public boolean isLeapYear(int year) {
        return year % 4 == 0 || year % 400 == 0 && year % 100 != 0;
    }

    public void rewriteArray() {
        int[] array = new int[]{1, 0, 0, 1, 1, 0, 0, 1};
        System.out.println("Массив задание 10 " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("Преобразован в массив " + Arrays.toString(array));
    }

    public void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Массив задание 11 " + Arrays.toString(array));
    }

    public void multiplyNumbersLessThan6() {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Массив задание 12 " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Преобразован в массив " + Arrays.toString(array));
    }

    public void fillTwoDimensionalArray() {
        System.out.println("Массив задание 13 ");
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void lenArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.println("Массив задание 14 " + Arrays.toString(array));
    }
}

