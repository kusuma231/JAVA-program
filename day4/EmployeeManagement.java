class Employee {
    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double calculateSalary() {
        return 30000;
    }
}

class PartTimeEmployee extends Employee {
    double calculateSalary() {
        return 15000;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        System.out.println("Full Time Salary: " + e1.calculateSalary());
        System.out.println("Part Time Salary: " + e2.calculateSalary());
    }
}
