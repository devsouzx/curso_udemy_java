package sections.section1a9.excercises.estrutura_sequencial;

import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();
    int hoursOfWork = sc.nextInt();
    double moneyPerHour = sc.nextDouble();

    double salary = moneyPerHour * hoursOfWork;

    System.out.println("NUMBER = " + number);
    System.out.printf("SALARY = U$%.2f%n", salary);
  }
}
