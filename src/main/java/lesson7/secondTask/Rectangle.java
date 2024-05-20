package lesson7.secondTask;

public class Rectangle implements Measurements, Color {
    private int length;
    private int width;
    private String colorBorder;
    private String colorFill;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
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
        System.out.println("\nПараметры прямоугольника:");
        printMeasurements(calculateArea(), calculatePerimeter());
        printColor(colorFill, colorBorder);
    }
}
