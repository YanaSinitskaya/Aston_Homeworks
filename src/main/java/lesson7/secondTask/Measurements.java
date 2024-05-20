package lesson7.secondTask;

public interface Measurements {
    double PI = 3.14;

    double calculateArea();

    double calculatePerimeter();

    default void printMeasurements(double area, double perimeter) {
        System.out.println("Площадь " + area);
        System.out.println("Периметр " + perimeter);
    }
}
