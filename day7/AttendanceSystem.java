import java.util.*;

public class AttendanceSystem {
    public static void main(String[] args) {
        LinkedHashSet<String> students = new LinkedHashSet<>();

        students.add("Rahul");
        students.add("Anu");
        students.add("Kiran");
        students.add("Rahul");

        for (String s : students)
            System.out.println(s);
    }
}
/*
Rahul
Anu
Kiran
*/
