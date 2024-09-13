import java.util.Scanner;

public class Uppgift6 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double seed = Math.random();
    long compGuess = Math.round(seed * 100);
    long humanGuess;
    int counter = 1;
    boolean run = true;

    while (run) {
      System.out.println("Enter your guess: ");
      humanGuess = scan.nextLong();
      System.out.println("comp guess: " + compGuess);

      if (humanGuess > compGuess) {
        counter++;
        System.out.println("Computer's guess is lower than yours. Try again");
      } else if (humanGuess < compGuess) {
        counter++;
        System.out.println("Computer's guess is larger than yours. Try again");
      } else {
        System.out.println("Your guess was correct! Total guesses: " + counter);
        scan.close();
        run = false;
        break;
      }
    }
  }
}
