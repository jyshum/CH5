import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int botRandomNumber = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100, including 1 and 100! Can you guess what it is?");

        // First guess
        System.out.print("Type a number: ");
        int userNumber = in.nextInt();
        System.out.println("Your guess is: " + userNumber);

        if (userNumber == botRandomNumber) {
            System.out.println("You got it! Congratulations!");
        } else if (userNumber < botRandomNumber) {
            System.out.println("Too low!");

            // Second guess
            System.out.print("Type a number: ");
            userNumber = in.nextInt();
            System.out.println("Your guess is: " + userNumber);

            if (userNumber == botRandomNumber) {
                System.out.println("You got it! Congratulations!");
            } else if (userNumber < botRandomNumber) {
                System.out.println("Too low!");

                // Third guess
                System.out.print("Type a number: ");
                userNumber = in.nextInt();
                System.out.println("Your guess is: " + userNumber);

                if (userNumber == botRandomNumber) {
                    System.out.println("You got it! Congratulations!");
                } else {
                    System.out.println("Sorry, you've run out of guesses. The number was " + botRandomNumber);
                }
            } else {
                System.out.println("Too high!");

                // Third guess
                System.out.print("Type a number: ");
                userNumber = in.nextInt();
                System.out.println("Your guess is: " + userNumber);

                if (userNumber == botRandomNumber) {
                    System.out.println("You got it! Congratulations!");
                } else {
                    System.out.println("Sorry, you've run out of guesses. The number was " + botRandomNumber);
                }
            }
        } else {
            System.out.println("Too high!");

            // Second guess
            System.out.print("Type a number: ");
            userNumber = in.nextInt();
            System.out.println("Your guess is: " + userNumber);

            if (userNumber == botRandomNumber) {
                System.out.println("You got it! Congratulations!");
            } else if (userNumber < botRandomNumber) {
                System.out.println("Too low!");

                // Third guess
                System.out.print("Type a number: ");
                userNumber = in.nextInt();
                System.out.println("Your guess is: " + userNumber);

                if (userNumber == botRandomNumber) {
                    System.out.println("You got it! Congratulations!");
                } else {
                    System.out.println("Sorry, you've run out of guesses. The number was " + botRandomNumber);
                }
            } else {
                System.out.println("Too high!");

                // Third guess
                System.out.print("Type a number: ");
                userNumber = in.nextInt();
                System.out.println("Your guess is: " + userNumber);

                if (userNumber == botRandomNumber) {
                    System.out.println("You got it! Congratulations!");
                } else {
                    System.out.println("Sorry, you've run out of guesses. The number was " + botRandomNumber);
                }
            }
        }

        in.close();
    }
}

