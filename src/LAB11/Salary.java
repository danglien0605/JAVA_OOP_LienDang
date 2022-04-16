package LAB11;

import java.util.ArrayList;
import java.util.List;

public class Salary {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        double total = 0;
        employees.add(new FullTimeEmployee());
        employees.add(new FullTimeEmployee());
        employees.add(new FullTimeEmployee());
        employees.add(new ContractEmployee());
        employees.add(new ContractEmployee());
        for (Employee emp : employees) {
            total += emp.salary();
        }
        System.out.println(total);
    }
}
