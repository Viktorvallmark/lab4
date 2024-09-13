package uppgift11;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    boolean run = true;
    Date today = Date.from(Instant.now());
    Bank bank = new Bank();
    User steve = bank.createUser(30, "Steve");
    // Absolute hackjob but its almost 1 am. Steve can only have one account, he is
    // poor
    bank.addUser(steve);
    steve.createAccountAndCard(23479);
    Account acc = steve.getAccAndCard().keySet().iterator().next();

    steve.addAmount(10.0, acc);
    Scanner scan = new Scanner(System.in);
    long input;

    while (run) {
      System.out.println("Please enter your pin: ");
      input = scan.nextLong();
      if (steve.getAccAndCard().get(acc).checkCardHealth(today)
          && (input != steve.getAccAndCard().get(acc).getPin())) {
        System.out.println("Wrong pin and card isn't valid. Please take your card");
      } else if (steve.getAccAndCard().get(acc).getPin() != input) {
        System.out.println("Wrong pin, try again");
      } else {
        System.out.println("Please enter the amount you want to withdraw: ");
        input = scan.nextInt();
        if ((long) acc.getAmount() >= input) {
          acc.withdrawAmount(input);
          scan.close();
          run = false;
          break;
        } else {
          System.out.println("Insufficient funds, card is ejected.");
          scan.close();
          run = false;
          break;
        }
      }
    }
  }
}
