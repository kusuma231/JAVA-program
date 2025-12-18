class EmptyStringException extends Exception {
    EmptyStringException(String msg) { super(msg); }
}

public class PalindromeChecker {
    public static void main(String[] args) {
        String s = "madam";

        try {
            if (s.isEmpty())
                throw new EmptyStringException("Empty string");

            String rev = new StringBuilder(s).reverse().toString();
            if (s.equals(rev))
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
