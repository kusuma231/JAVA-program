import java.util.*;

class Student {
    int id;
    String name, course;

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
}

public class StudentRegistry {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Rahul", "Java"));
        list.add(new Student(2, "Anu", "Python"));
        list.add(new Student(3, "Kiran", "C++"));
        list.add(new Student(4, "Meena", "Java"));
        list.add(new Student(5, "Suresh", "Web"));

        for (Student s : list)
            System.out.println(s.id + " " + s.name + " " + s.course);

        int searchId = 3;
        for (Student s : list) {
            if (s.id == searchId)
                System.out.println("Found: " + s.name);
        }
    }
}
/*
1 Rahul Java
2 Anu Python
3 Kiran C++
4 Meena Java
5 Suresh Web
Found: Kiran

*/
