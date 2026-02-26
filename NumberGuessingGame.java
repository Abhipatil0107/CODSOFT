import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Welcome to Number Guessing Game");

        while(guess != number) {

            System.out.print("Enter your guess (1-100): ");
            guess = sc.nextInt();

            if(guess < number)
                System.out.println("Too Low!");
            else if(guess > number)
                System.out.println("Too High!");
            else
                System.out.println("Correct Number!");
        }
    }
}