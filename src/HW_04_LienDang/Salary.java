package HW_04_LienDang;

import java.util.Arrays;
import java.util.List;

public class Salary {

    public static void main(String[] args) {
        double total = 0;
       Employee emp01 = new Employee("Nguyen Văn A","em01", 10000 );
       Employee emp02 = new Employee("Nguyen Van B",  "Em02", 20000);
       CEO ceo01 = new CEO("Nguyen Van C",  "ceo01", 25000);
       Manager mana01 = new Manager("Nguyen Van D",  "mana01", 26000);
       List<Employee> ems = Arrays.asList(emp01, emp02);
       for (Employee em: ems){
           total +=em.getSalary();
       }
        System.out.println(total += ceo01.getSalary() + mana01.getSalary());

    }
}
