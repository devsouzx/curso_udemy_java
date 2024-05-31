package sections.section1a9.excercises.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double salary = sc.nextDouble();
    double imposto;

    if (salary <= 2000.0) {
      imposto = 0.0;
    } else if (salary > 2000.0 && salary <= 3000.0) {
      imposto = (salary - 2000.0) * 0.08;
    } else if (salary > 3000.0 && salary <= 4500.0) {
      imposto = (salary - 3000.0) * 0.18 + 80;
    } else {
      imposto = (salary - 4500.0) * 0.28 + 350;
    }

    if (imposto == 0.0) {
      System.out.println("Insento");
    } else {
      System.out.printf("R$ %.2f%n", imposto);
    }

    sc.close();
  }
}
