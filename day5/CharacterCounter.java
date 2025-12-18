public class CharacterCounter {
    public static void main(String[] args) {
        String s = "java";
        char ch = 'x';
        int count = 0;

        try {
            if (s == null)
                throw new NullPointerException("String is null");

            for (char c : s.toCharArray()) {
                if (c == ch)
                    count++;
            }

            if (count == 0)
                System.out.println("Character not found");
            else
                System.out.println("Count: " + count);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
