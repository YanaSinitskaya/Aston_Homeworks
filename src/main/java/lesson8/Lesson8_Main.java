package lesson8;

public class Lesson8_Main {
    public static void main(String[] args) {
        String[][] array = {{"a", "b", "c", "d"}, {"1", "2", "3", "4"}, {"e", "f", "g", "h"}, {"5", "6", "7", "8"}};
        try {
            sumArray(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length > 4 || array[0].length > 4) {
            throw new MyArraySizeException("Размер массива больше 4-ех");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неподходящий элемент массива для суммирования в строке " + i + " и столбце " + j);
                }
            }
        }
        System.out.println(sum);
    }
}
