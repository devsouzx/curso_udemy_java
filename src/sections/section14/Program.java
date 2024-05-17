package sections.section14;

import sections.section14.entities.Account;
import sections.section14.entities.BusinessAccount;
import sections.section14.entities.SavingsAccount;

public class Program {
  public static void main(String[] args) {
    BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 560.0);

    // UPCASTING

    Account account1 = businessAccount;
    Account account2 = new BusinessAccount(1003, "Bob", 0.0, 123.0);
    Account account3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

    // DOWNCAST

    BusinessAccount account4 = (BusinessAccount) account2;
    account4.loan(2342);


    if (account3 instanceof BusinessAccount) {
      BusinessAccount account5 = (BusinessAccount) account3;
      account5.loan(234);
      System.out.println("loan");
    }

    if (account3 instanceof SavingsAccount) {
      SavingsAccount account5 = (SavingsAccount) account3;
      account5.updateBalance();
      System.out.println("upload");
    }

    Account acc2 = new SavingsAccount(3455, "Alex", 1000.0, 500.0);
    acc2.withdraw(200.0);
    System.out.println(acc2.getBalance());

    Account acc3 = new BusinessAccount(2434, "joao", 1000.0, 500.0);
    acc3.withdraw(200.0);
    System.out.println(acc3.getBalance());
  }
}
