class WeakPasswordException extends Exception {
    WeakPasswordException(String msg) { super(msg); }
}

public class PasswordChecker {
    public static void main(String[] args) {
        String password = "Java123";

        try {
            if (password.length() < 8 ||
                !password.matches(".*[A-Z].*") ||
                !password.matches(".*[a-z].*") ||
                !password.matches(".*[0-9].*"))
                throw new WeakPasswordException("Weak password");

            System.out.println("Strong password");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
