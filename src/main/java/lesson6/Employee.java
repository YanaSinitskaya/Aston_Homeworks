package lesson6;

public class Employee {

    private String lastName;
    private String firstName;
    private String patronymic;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String lastName, String firstName, String patronymic, String post, String email,
                    String phoneNumber, int salary, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void showEmployeeInfo() {
        System.out.println("Last Name: " + lastName + "\n" + "First Name: " + firstName + "\n" + "Patronymic: " + patronymic
                + "\n" + "Post: " + post + "\n" + "email: " + email + "\n" + "Phone number: " + phoneNumber
                + "\n" + "Salary: " + salary + "\n" + "Age: " + age);
    }

}
