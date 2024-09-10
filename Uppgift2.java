import java.util.Scanner;

public class Uppgift2 {

  public static void main(String[] args) {
    // Variable declarations
    int first, second, third, largest;
    Scanner scan = new Scanner(System.in);
    int[] arr = new int[3];

    // Getting user input
    System.out.println("Enter first number: ");
    first = scan.nextInt();
    System.out.println("Enter second number: ");
    second = scan.nextInt();
    System.out.println("Enter third number: ");
    third = scan.nextInt();

    arr[0] = first;
    arr[1] = second;
    arr[2] = third;
    largest = 0;
    scan.close();
    for (int num : arr) {
      if (num > largest) {
        largest = num;
      }
    }

    for (int num : arr) {
      if (largest == num) {
        continue;
      }
    }
  }
}
