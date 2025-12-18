class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    String reverseName() {
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        return rev;
    }
}

public class EmployeeArray {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Kusuma"),
            new Employee("Anu"),
            new Employee("Ravi")
        };

        for (Employee e : employees) {
            System.out.println(e.reverseName());
        }
    }
}
