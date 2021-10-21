package HW05;

public class Employee {
    private String fullName;
    private String ID;

    private double salary;

    public Employee() {
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
