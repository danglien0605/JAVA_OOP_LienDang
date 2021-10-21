package HW_04_LienDang;

public class CEO {
    private String fullName;
    private String ID;
    private double salary;

    public CEO(String fullName, String ID, double salary) {

        this.fullName = fullName;
        this.ID = ID;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
