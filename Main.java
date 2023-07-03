
import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            try {
                System.out.print("Enter a positive integer: ");
                int num = scanner.nextInt();

                if (num < 0) {
                    throw new NegativeNumberException("Negative numbers are not allowed.");
                }

                sum += num;
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                i--; // Decrement the loop counter to re-enter the current iteration.
            }
        }

        double average = (double) sum / n;
        System.out.println("The average is: " + average);

        scanner.close();
    }
}

