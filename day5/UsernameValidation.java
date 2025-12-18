class InvalidUsernameException extends Exception {
    InvalidUsernameException(String msg) {
        super(msg);
    }
}

public class UsernameValidation {
    public static void main(String[] args) {
        String username = "java user";

        try {
            if (username.contains(" ") || username.length() < 5)
                throw new InvalidUsernameException("Invalid Username");
            else
                System.out.println("Registration successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
