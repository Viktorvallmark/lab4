import java.util.Scanner;

public class Uppgift2 {

  private static boolean compare(int first, int second) {

    if (first == second) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {

    int first, second, third, largest, smallest, index, count;
    Scanner scan = new Scanner(System.in);
    int[] arr = new int[3];

    // Getting user input
    System.out.println("Enter first number: ");
    first = scan.nextInt();
    System.out.println("Enter second number: ");
    second = scan.nextInt();
    System.out.println("Enter third number: ");
    third = scan.nextInt();

    scan.close();

    arr[0] = first;
    arr[1] = second;
    arr[2] = third;
    largest = first;
    smallest = first;
    count = 0;

    // This loop is doing some heavy lifting
    for (index = 1; index < arr.length; index++) {

      if (arr[index] > largest) {
        largest = arr[index];
      } else if (arr[index] == largest) {
        count++;
      } else if (arr[index] < smallest) {
        smallest = arr[index];
      }
    }
    // Blursed comparisons
    if ((compare(first, second)) && (compare(second, third))) {
      System.out.println("The numbers are the same.");
    } else if (((compare(first, second)) || (compare(first, third)) || (compare(second, third)))
        && ((smallest < first) && (smallest < second) && (smallest < third))) {
      System.out.println(
          "Two numbers are the same and third is smaller. Smallest number is: " + smallest);
    } else if (count < 1) {
      System.out.println("One number is bigger than the rest and it's: " + largest);
    }
  }
}
