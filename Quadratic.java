import java.util.Scanner;

public class Quadratic {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        System.out.print("a ");
        int a = in.nextInt();
        System.out.print("b ");
        int b = in.nextInt();
        System.out.print("c ");
        int c = in.nextInt();

        double plusX = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c) ) / 2*a;
        double minusX = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c) ) / 2*a;

        System.out.println("Positive: " + plusX);
        System.out.println("Negative: " + minusX);
    }
}
