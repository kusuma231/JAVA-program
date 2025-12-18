import java.util.*;

class Course {
    int id;
    String name;

    Course(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course(101, "Java"));

        for (Course c : courses)
            System.out.println(c.id + " " + c.name);
    }
}
/*
101 Java
*/
