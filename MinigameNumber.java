import java.util.Random;
import java.util.Scanner;
public class MinigameNumber {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int guess, answer, guesses;
         String name ;
            System.out.print("enter your Playername :");
            name = scanner.nextLine();
            System.out.println("I am thinking of a number between 1 and 20");
             Random random = new Random(); 
            answer = random.nextInt(20) + 1;
            guesses = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            guesses++;
        if(guess < answer) {
            System.out.println("Your guess is too low.");
        } else if(guess > answer) {
            System.out.println("Your guess is too high.");
        } else {
             System.out.println("Correct!"+name+" guessed the number.");
             break;
        }
        if(guesses == 5) {
            System.out.println("Sorry, you lose lol so noob. The number was " + answer + ".");
        }
}
}
}