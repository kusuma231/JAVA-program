import java.util.*;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String s = "Good Morning";
        Set<Character> set = new LinkedHashSet<>();

        for (char c : s.toCharArray()) {
            if (c != ' ') {
                set.add(c);
            }
        }

        for (char c : set) {
            System.out.print(c);
        }
    }
}
/*
GodMrnig
*/
