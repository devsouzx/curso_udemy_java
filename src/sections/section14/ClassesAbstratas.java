package sections.section14;

import sections.section14.entities.Account;
import sections.section14.entities.BusinessAccount;
import sections.section14.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class ClassesAbstratas {
  public static void main(String[] args) {
    List<Account> accounts = new ArrayList<>();

    accounts.add(new SavingsAccount(3455, "Alex", 1000.0, 500.0));
    accounts.add(new BusinessAccount(2434, "joao", 3450.0, 500.0));
    accounts.add(new SavingsAccount(3444, "pedro", 1000.0, 500.0));
    accounts.add(new BusinessAccount(2324, "maria", 200.0, 500.0));

    double sum = 0;
    for (Account account : accounts) {
      sum += account.getBalance();
    }
    System.out.println(sum);

    for (Account account : accounts) {
      account.deposit(10.0);
    }
    for (Account account : accounts) {
      System.out.println(account.getBalance());
    }
  }
}
