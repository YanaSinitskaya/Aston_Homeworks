package lesson6;

public class Lesson6_Main {
    public static void main(String[] args) {
        System.out.println("Первое задание:" + "\n");

        Employee employee = new Employee("Ivaniv", "Ivan", "Ivanovich",
                "lawyer", "vanya44@gmail.com", "+375297915478", 1500, 28);
        employee.showEmployeeInfo();

        System.out.println("\n" + "Второе задание:" + "\n");
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Davidov", "Ignat", "Nikitovich",
                "engineer", "dav_ig@gmail.com", "+375297114477", 1000, 20);
        employeeArray[1] = new Employee("Korotinina", "Anna", "Aleksandrovna",
                "administrator", "anna1977@gmail.com", "+375447814147", 900, 47);
        employeeArray[2] = new Employee("Novik", "Sergey", "Anatolyevich",
                "engineer", "nsa@mail.ru", "+375337186472", 1000, 31);
        employeeArray[3] = new Employee("Novitskaya", "Anastasiya", "Sergeevna",
                "HR", "nova@gmail.com", "+375257684483", 1300, 28);
        employeeArray[4] = new Employee("Avukhin", "Viktor", "Nikitovich",
                "lawyer", "lawyer@gmail.com", "+375257114787", 1200, 40);
        for (int i = 0; i < employeeArray.length; i++) {
            employeeArray[i].showEmployeeInfo();
        }

        System.out.println("\n" + "Третье задание:" + "\n");
        Park park = new Park("Карусель", "крутится", "9:00-18:00", 5);
        park.outputInformationOfPark();
    }
}
