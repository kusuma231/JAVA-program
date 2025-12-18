import java.util.*;

class Score implements Comparable<Score> {
    String name;
    int marks;

    Score(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Score s) {
        return s.marks - this.marks;
    }
}

public class ExamRankingSystem {
    public static void main(String[] args) {
        TreeSet<Score> set = new TreeSet<>();

        set.add(new Score("Anu", 95));
        set.add(new Score("Rahul", 88));
        set.add(new Score("Kiran", 80));

        for (Score s : set)
            System.out.println(s.name + " " + s.marks);
    }
}
/*
Anu 95
Rahul 88
Kiran 80
*/
