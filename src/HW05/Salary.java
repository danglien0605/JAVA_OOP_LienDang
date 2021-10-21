package HW05;

public class Salary {
    static Employee emp_01 = new Employee(10000);
    static Employee emp_02 = new Employee(10000);
    static Employee emp_03 = new Manager(20000, 1000 );
    static Employee emp_04 = new CEO(30000, 2000 );

    public static void main(String[] args) {
        System.out.printf("Total salary is %.2f", (emp_01.getSalary()+emp_02.getSalary() + emp_03.getSalary() + emp_04.getSalary()));
    }

}
