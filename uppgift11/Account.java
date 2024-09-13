package uppgift11;

public class Account {

  private int accNumber;
  private double amount;
  private User user;
  private long id;
  private Card card;

  public Account(int accNumber, User user) {
    this.card = new Card(user, this);
    this.amount = 0;
    this.id = 1;
    this.accNumber = accNumber;
    this.user = user;
  }

  public User getUser() {
    return user;
  }

  public void incrementAccountId() {
    this.id++;
  }

  public double getAmount() {
    return amount;
  }

  public int getAccNumber() {
    return accNumber;
  }

  public Card getCard() {
    return card;
  }

  public long getAccId() {
    return id;
  }

  public double addAmount(double add) {
    this.amount += add;
    System.out.println("Added " + add + " to account " + this.accNumber);
    return this.amount;
  }

  public void withdrawAmount(double withdraw) {

    this.amount -= withdraw;
    System.out.println("Withdrew: " + withdraw + " from account: " + this.accNumber);
  }
}
