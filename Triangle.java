import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first length: ");
        if (!in.hasNextInt()) {
            String word = in.next();
            System.err.println("Error: '" + word + "' is not a valid integer");
            return;
        }
        int a = in.nextInt();

        System.out.print("Enter the second length: ");
        if (!in.hasNextInt()) {
            String word = in.next();
            System.err.println("Error: '" + word + "' is not a valid integer");
            return;
        }
        int b = in.nextInt();

        System.out.print("Enter the third length: ");
        if (!in.hasNextInt()) {
            String word = in.next();
            System.err.println("Error: '" + word + "' is not a valid integer");
            return;
        }
        int c = in.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Error: All lengths must be positive (greater than zero).");
            return;
        }

        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("You cannot form a triangle.");
        } else {
            System.out.println("You can form a triangle.");
        }
    }
}