class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

class StudentNotFoundException extends Exception {
    StudentNotFoundException(String msg) {
        super(msg);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "Kusuma", 85),
            new Student(2, "Anu", 90)
        };

        int searchId = 3;
        boolean found = false;

        try {
            for (Student s : students) {
                if (s.id == searchId) {
                    System.out.println(s.id + " " + s.name + " " + s.marks);
                    found = true;
                }
            }
            if (!found)
                throw new StudentNotFoundException("Student ID not found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
