import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    //    Don't need main method. GuessingGame constructor below
    public GuessingGame() {
        Scanner input = new Scanner(System.in);
        boolean correctGuess = false;
        int guess = 0;
        int increment = 0;


        System.out.println("Hello user. What is your name?");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " I’m thinking of a number between 1 and 100.");
        //creating random object with constructor
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println("Try to guess my number.");
        while (correctGuess == false) {
            increment++;
            try {
                guess = input.nextInt();
            } catch (Exception e) {
                String badInput = input.next(); //to progress past bad input
                System.out.println("That's not an integer, try again");
                continue; //back to the beginning of the while loop
            }
            if (guess > 100 || guess < 1) {
                System.out.println("Your guess is out of range. Please try again.");
            } else if (guess > number) {
                System.out.println("You're guess is too high. Please try again.");
            } else if (guess < number) {
                System.out.println("You're guess is too low. Please try again.");
            } else if (guess == number) {
                System.out.println("Well done, " + name + "! You found my number in " + increment + " tries!");
                correctGuess = true;
            }
        }
    }
}







