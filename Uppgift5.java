import java.util.Scanner;

public class Uppgift5 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int input;
    int counter = 0;
    int sum = 0;
    boolean run = true;

    while (run) {
      System.out.println("Enter your numbers. To print avg of your numbers, enter -1: ");
      input = scan.nextInt();
      if (input == -1) {
        System.out.println("The avg of your numbers is: " + (sum / counter));
        run = false;
        scan.close();
        break;
      }
      sum += input;
      counter++;
    }
  }
}
