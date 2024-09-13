package uppgift11;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Bank {

  private ArrayList<User> users;

  public Bank() {
    this.users = new ArrayList<User>();
  }

  public User createUser(int age, String name) {

    return new User(age, name);
  }

  public ArrayList<User> getUsers() {
    return users;
  }

  public Optional<User> getUser(User user) {
    if (this.users.contains(user)) {
      return Optional.of(user);
    } else {
      return Optional.empty();
    }
  }

  public boolean addUser(User user) {
    return users.add(user);
  }

  public boolean checkCardHealth(User user, Account acc) {
    try {
      User targetUser = getUser(user).orElseThrow();
      Card card = targetUser.getAccAndCard().get(acc);
      return card.checkCardHealth(card.getVoidDate());

    } catch (NoSuchElementException e) {
      System.out.println("No such card was found");
    }
    return false;
  }
}
