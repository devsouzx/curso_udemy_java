package sections.section15.exercise;

import sections.section15.exercise.entities.Account;
import sections.section15.exercise.exceptions.BusinessException;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter account data");
    System.out.print("Number: ");
    int number = sc.nextInt();
    System.out.print("Holder: ");
    sc.nextLine();
    String holder = sc.nextLine();
    System.out.print("Initial balance: ");
    double balance = sc.nextDouble();
    System.out.print("Withdraw limit: ");
    double withdrawLimit = sc.nextDouble();

    System.out.println();
    Account account = new Account(number, holder, balance, withdrawLimit);

    System.out.print("Enter amount for withdraw: ");
    double withdraw = sc.nextDouble();

    try {
      account.withdraw(withdraw);
      System.out.println(account.getBalance());
    }
    catch (BusinessException e) {
      System.out.println("Withdraw error: " + e.getMessage());
    }
    catch (RuntimeException e) {
      System.out.println("Unexpected error");
    }

    sc.close();
  }
}
