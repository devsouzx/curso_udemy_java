package sections.section14.exercise4;

import sections.section14.exercise4.entities.Company;
import sections.section14.exercise4.entities.Individual;
import sections.section14.exercise4.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<TaxPayer> taxPayers = new ArrayList<>();

    System.out.print("Enter the number of tax payers: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Tax payer #" + i + " data:");
      System.out.print("Individual or company (i/c)? ");
      char type = sc.next().charAt(0);
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Anual income: ");
      double anualIncome = sc.nextDouble();
      if (type == 'i') {
        System.out.print("Health expenditures: ");
        double expenditures = sc.nextDouble();
        taxPayers.add(new Individual(name, anualIncome, expenditures));
      } else {
        System.out.print("Number of employees: ");
        int numberOfEmployees = sc.nextInt();
        taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
      }
    }

    double sum = 0.0;
    System.out.println();
    System.out.println("TAXES PAID:");
    for (TaxPayer taxPayer : taxPayers) {
      System.out.println(taxPayer.getName() + ": $" + String.format("%.2f", taxPayer.tax()));
      sum += taxPayer.tax();
    }

    System.out.println();
    System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

    sc.close();
  }
}
