public class RemoveSpecificChar {
    public static void main(String[] args) {
        String s = "banana";
        char remove = 'a';

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != remove) {
                result += s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
/*
bnn
*/
