package sections.section18;

import sections.section18.entities.InterestService;
import sections.section18.entities.UsaInterestService;

import java.util.Scanner;

public class DefaultMethods {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Amount: ");
    double amount = sc.nextDouble();
    System.out.print("Months: ");
    int months = sc.nextInt();

    InterestService is = new UsaInterestService(1.0);
    double payment = is.payment(amount, months);

    System.out.println("Payment after " + months + " months:");
    System.out.printf("%.2f%n", payment);

    sc.close();
  }
}
