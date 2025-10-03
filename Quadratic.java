import java.util.Scanner;

public class Quadratic {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        System.out.print("a? ");
        if (!in.hasNextInt()) {
            String word = in.next();
            System.out.println("Error: '" + word + "' is not a valid integer");
            return;
        }
        int a = in.nextInt();

        if (a == 0) {
            System.out.println("Error: 'a' cannot be 0 (would cause division by zero)");
            return;
        }

        System.out.print("b? ");
        if (!in.hasNextInt()) {
            String word = in.next();
            System.out.println("Error: '" + word + "' is not a valid integer");
            return;
        }
        int b = in.nextInt();

        System.out.print("c? ");
        if (!in.hasNextInt()) {
            String word = in.next();
            System.out.println("Error: '" + word + "' is not a valid integer");
            return;
        }
        int c = in.nextInt();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("Error: No real solutions exist (discriminant is negative)");
            return;
        }

        double plusX = (-b + Math.sqrt(discriminant)) / (2 * a);
        double minusX = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("Positive: " + plusX);
        System.out.println("Negative: " + minusX);
    }
}
