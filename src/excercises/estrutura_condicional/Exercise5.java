package excercises.estrutura_condicional;

import java.util.Scanner;

public class Exercise5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int code = sc.nextInt();
    int quantity = sc.nextInt();

    double total;
    if (code == 1) {
      total = quantity * 4.0;
    }
    else if (code == 2) {
      total = quantity * 4.5;
    }
    else if (code == 3) {
      total = quantity * 5.0;
    }
    else if (code == 4) {
      total = quantity * 2.0;
    }
    else {
      total = quantity * 1.5;
    }

    System.out.printf("Total: R$%.2f%n", total);

    sc.close();
  }
}
