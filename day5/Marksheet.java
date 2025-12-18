class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) { super(msg); }
}

public class Marksheet {
    public static void main(String[] args) {
        int[] marks = {80, 90, 85, 70, 95};
        int total = 0;

        try {
            for (int m : marks) {
                if (m < 0 || m > 100)
                    throw new InvalidMarksException("Invalid marks");
                total += m;
            }

            double percentage = total / 5.0;
            System.out.println("Percentage: " + percentage);

            if (percentage >= 90) System.out.println("Grade A");
            else if (percentage >= 75) System.out.println("Grade B");
            else System.out.println("Grade C");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
