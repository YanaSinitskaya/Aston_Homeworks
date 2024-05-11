package lesson7.secondTask;

public interface Color {

    void setFillColor(String colorFilling);

    void setBorderColor(String colorBorder);

    default void printColor(String colorFilling, String colorBorder) {
        System.out.println("Заливка " + colorFilling);
        System.out.println("Границы " + colorBorder);
    }

}
