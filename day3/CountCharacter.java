public class CountCharacter {
    public static void main(String[] args) {
        String s = "programming";
        char ch = 'g';
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Occurrence of " + ch + ": " + count);
    }
}
/*
Occurrence of g: 2
*/   
