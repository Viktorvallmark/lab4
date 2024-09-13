import java.util.Scanner;

public class Uppgift1 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String firststring, secondstring;
    int first, second;
    boolean run = true;

    while (run) {
      System.out.println("Enter first number: ");
      firststring = scan.next();
      System.out.println("Enter second number: ");
      secondstring = scan.next();

      try {
        first = Integer.parseInt(firststring);
        second = Integer.parseInt(secondstring);

        if (first > second) {
          System.out.println("first is bigger than second");
          scan.close();
          run = false;
          break;
        } else if (first == second) {
          System.out.println("first and second are the same number");
          scan.close();
          run = false;
          break;
        } else {
          System.out.println("second is bigger than first");
          scan.close();
          run = false;
          break;
        }

      } catch (NumberFormatException e) {
        System.out.println("Error while comparing. Enter only integers");
      }
    }
  }
}
