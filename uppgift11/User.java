package uppgift11;

import java.util.HashMap;

public class User {

  private int age;
  private String name;
  private HashMap<Account, Card> accsAndCards;
  private long id;

  public User(int age, String name) {
    this.id = 1;
    this.age = age;
    this.name = name;
    this.accsAndCards = new HashMap<>();
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void incrementUserId() {
    this.id++;
  }

  public long getUserId() {
    return id;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HashMap<Account, Card> getAccAndCard() {
    return this.accsAndCards;
  }

  public void createAccountAndCard(int accnum) {
    Account acc = new Account(accnum, this);
    acc.incrementAccountId();
    accsAndCards.putIfAbsent(acc, acc.getCard());
  }

  public boolean removeAccountAndCard(Account acc) {
    System.out.println(
        "Account: " + acc + " with balance: " + acc.getAmount() + " has been deleted.");
    return accsAndCards.remove(acc, acc.getCard());
  }

  public boolean addAmount(double amount, Account acc) {
    if (accsAndCards.containsKey(acc)) {
      acc.addAmount(amount);
      return true;
    } else {
      return false;
    }
  }
}
