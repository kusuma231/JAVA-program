import java.util.*;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String s = "Java is Java and Java is powerful";
        String[] words = s.split(" ");

        Set<String> set = new LinkedHashSet<>();
        for (String word : words) {
            set.add(word);
        }

        for (String word : set) {
            System.out.print(word + " ");
        }
    }
}
/*
Java is and powerful 
*/
