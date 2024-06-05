package sections.section1a9.excercises;

import sections.section1a9.entities.CurrencyDollar;

import java.util.Scanner;

public class MembrosEstaticosExercise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.printf("what is the dollar price: %.2f%n", CurrencyDollar.dollar);


    System.out.print("how many dollars will be bought: ");
    CurrencyDollar.amount = sc.nextDouble();

    System.out.printf("amount to be paid in reais = %.2f%n", CurrencyDollar.value());

    sc.close();
  }
}
