package excercises.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int code1, code2, quantity1, quantity2;
    double price, price1, price2;

    code1 = sc.nextInt();
    quantity1 = sc.nextInt();
    price1 = sc.nextDouble();

    code2 = sc.nextInt();
    quantity2 = sc.nextInt();
    price2 = sc.nextDouble();

    price = (price1 * quantity1) + (price2 * quantity2);

    System.out.printf("VALOR A PAGAR: $%.2f%n", price);

    sc.close();
  }
}
