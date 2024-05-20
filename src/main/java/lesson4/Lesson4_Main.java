package lesson4;

public class Lesson4_Main {
    public static void main(String[] args) {
        Homework_L4 homework = new Homework_L4();
        homework.printThreeWords();
        homework.checkSumSign();
        homework.printColor();
        homework.compareNumbers();
        System.out.println(homework.checkSumRange(44, 972));
        System.out.println(homework.checkPositiveOrNegativeString(0));
        System.out.println(homework.checkPositiveOrNegativeBoolean(-1557));
        homework.writePhraseNTimes("Hello", 4);
        System.out.println(homework.isLeapYear(2024));
        homework.rewriteArray();
        homework.fillArray();
        homework.multiplyNumbersLessThan6();
        homework.fillTwoDimensionalArray();
        homework.lenArray(5, 1);
    }
}
