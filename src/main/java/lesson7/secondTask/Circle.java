package lesson7.secondTask;

public class Circle implements Measurements, Color {
    private final double RADIUS;
    private String colorBorder;
    private String colorFill;

    public Circle(double radius) {
        this.RADIUS = radius;
    }

    @Override
    public double calculateArea() {
        return PI * RADIUS * RADIUS;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * RADIUS;
    }

    @Override
    public void setFillColor(String colorFilling) {
        this.colorFill = colorFilling;
    }

    @Override
    public void setBorderColor(String colorBorder) {
        this.colorBorder = colorBorder;
    }

    public void printCharacteristic() {
        System.out.println("\nПараметры круга:");
        printMeasurements(calculateArea(), calculatePerimeter());
        printColor(colorFill, colorBorder);
    }
}
