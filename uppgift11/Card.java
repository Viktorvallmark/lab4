package uppgift11;

import java.time.Instant;
import java.util.Date;

public class Card {

  private User user;
  private long cardNumber;
  private Date voidDate;
  private long pin;
  private Account acc;

  public Card(User user, Account acc) {
    this.user = user;
    this.acc = acc;
    this.pin = Math.round(Math.random() * 9999);
    this.cardNumber = Math.round(Math.random() * 10000);
    this.voidDate = Date.from(Instant.parse("2025-06-22T10:30:00.00Z"));
  }

  public Account getAcc() {
    return acc;
  }

  public long getPin() {
    return pin;
  }

  public User getUser() {
    return this.user;
  }

  public long getCardNumber() {
    return this.cardNumber;
  }

  public Date getVoidDate() {
    return voidDate;
  }

  public boolean checkCardHealth(Date date) {
    Instant now = Instant.now();
    Date today = Date.from(now);
    if (today.after(date)) {
      return false;
    } else {
      return true;
    }
  }
}
