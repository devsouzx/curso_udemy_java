package sections.section1a9.excercises.estrutura_repetitiva;

import java.util.Scanner;

public class Exercise7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (b == 0) {
        System.out.println("divisao impossivel");
      } else {
        double sum = (double) a / b;
        System.out.printf("%.1f%n", sum);
      }
    }

    sc.close();
  }
}
