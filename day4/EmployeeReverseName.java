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

public class EmployeeReverseName {
    public static void main(String[] args) {
        Employee e = new Employee("Kusuma");
        System.out.println(e.reverseName());
    }
}
