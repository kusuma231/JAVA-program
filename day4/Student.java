class Student {
    private String name;
    private int rollNo;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100)
            this.marks = marks;
        else
            System.out.println("Invalid marks");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Kusuma");
        s.setRollNo(101);
        s.setMarks(85);
        s.displayDetails();
    }
}
