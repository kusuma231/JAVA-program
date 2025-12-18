import java.util.*;

class Employee {
    int id;
    String email;

    Employee(int id, String email) {
        this.id = id;
        this.email = email;
    }
}

public class UniqueEmailSystem {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();

        emails.add("john@gmail.com");
        emails.add("anu@yahoo.com");
        emails.add("john@gmail.com");

        for (String e : emails)
            System.out.println(e);
    }
}
/*
john@gmail.com
anu@yahoo.com
*/
