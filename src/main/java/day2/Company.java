package day2;

public class Company {
    public static void main(String[] args) {
        Employee programmer;
        Employee tester;

        tester = new Employee("Anna", "Kowalska", 25);
        programmer = new Employee("Karol", "Kowalski", 35);
        printEmployer(tester);
        printEmployer(programmer);
        }

        public static void printEmployer(Employee employee) {
            System.out.println(employee);
        }
}