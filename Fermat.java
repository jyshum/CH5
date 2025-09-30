import java.util.Scanner;

public class Fermat {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        System.out.print("n?");
        int n = in.nextInt();
        System.out.print("c?");
        int c = in.nextInt();
        System.out.print("b?");
        int b = in.nextInt();
        System.out.print("a");
        int a = in.nextInt();

        double fermatTheoremEQ = Math.pow(a,n) + Math.pow(b,n);
        double fermatTheoremANS = Math.pow(c,n);

        if (n >= 2) {
            if (fermatTheoremEQ == fermatTheoremANS) {
                System.out.println("Holy smokes, Fermat was wrong!");
            } else {
                System.out.println("Nope that dosen't work.");
            }
        } else {
            if (fermatTheoremEQ == fermatTheoremANS) {
                System.out.println("Oh it works, and n was smaller than 2. I guess Fermat was right");
            } else {
                System.out.println("I guess the numbers didnt work out.");
            }
        }


    }
}
