public class CountVowels {
    public static void main(String[] args) {
        String s = "Good Morning";
        int count = 0;

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;
            }
        }
        System.out.println("Vowels count: " + count);
    }
}
/*
out put
  Vowels count: 4
  */
