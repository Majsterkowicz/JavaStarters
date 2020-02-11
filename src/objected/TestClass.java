package objected;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee("jan", "kowalski", 5000);
        Employee employee2 = new Supervisor("stefan", "nowak", 6000, 300);
        Employee[] staff = new Employee[2];
        staff[0] = employee1;
        staff[1] = employee2;

        for (int i = 0; i < staff.length; i++){
            String note = staff[i].showClass();
            System.out.println(note);
        }

        List<Employee> list = new ArrayList<>(); //tak się tworzy, bez zagłębiania w szczegóły
        list.add(employee1);
        list.add(employee2);
        for (Employee employee : list) {
            System.out.println(employee.showClass());
        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }

}