abstract class Employee {
    abstract double calculateSalary();
}

class Manager extends Employee {
    double calculateSalary() {
        return 50000;
    }
}

class Developer extends Employee {
    double calculateSalary() {
        return 40000;
    }
}

public class AbstractEmployee {
    public static void main(String[] args) {
        Employee m = new Manager();
        Employee d = new Developer();

        System.out.println("Manager Salary: " + m.calculateSalary());
        System.out.println("Developer Salary: " + d.calculateSalary());
    }
}
