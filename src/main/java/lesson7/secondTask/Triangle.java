package lesson7.secondTask;

public class Triangle implements Measurements, Color {
    private int side1;
    private int basement;
    private int height;
    private String colorBorder;
    private String colorFill;

    public Triangle(int side1, int basement, int height) {
        this.side1 = side1;
        this.basement = basement;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return basement * height;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + basement + height;
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
        System.out.println("\nПараметры треугольника:");
        printMeasurements(calculateArea(), calculatePerimeter());
        printColor(colorFill, colorBorder);
    }
}
