package day2;

public class EmployeeRole extends Employee {
    private String role;

    public EmployeeRole(String name, String lastName, int age, String role) {
        super(name, lastName, age);
        this.role = role;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "EmployeeRole{" +
                "role='" + role + '\'' +
                '}';
    }
}
