import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Rahul", 30000));

        list.get(0).salary = 35000;

        for (Employee e : list)
            System.out.println(e.id + " " + e.name + " " + e.salary);
    }
}
/*
1 Rahul 35000.0
*/
