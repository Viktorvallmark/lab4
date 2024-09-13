import java.util.Scanner;

public class Uppgift7 {

  public static void main(String[] args) {

    int cost = 0;
    int choice;
    Scanner scan = new Scanner(System.in);
    boolean run = true;

    while (run) {

      System.out.println(
          "What do you want to do?: \n"
              + " 1. Controll teeth. \n"
              + " 2. Clean teeth \n"
              + " 3. Root canal \n "
              + "-1. Get invoice and exit");

      choice = scan.nextInt();
      switch (choice) {
        case 1:
          cost += 600;
          break;
        case 2:
          cost += 300;
          break;
        case 3:
          cost += 1500;
          break;
        case -1:
          if (cost >= 3000) {
            System.out.println(
                "Total cost is: "
                    + cost
                    + ". You get 10% reduced price. Total payment after reductions: "
                    + (cost * 0.9));
            run = false;
            scan.close();
          } else {
            System.out.println(
                "Total cost is: "
                    + cost
                    + " No reductions have been added. Total price to pay is: "
                    + cost);
            run = false;
            scan.close();
          }
          break;
        default:
          System.out.println("Something went horribly wrong in the event loop");
          break;
      }
    }
  }
}
