package sections.section1a9.excercises.estrutura_sequencial;

import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, c, d, result;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();
    result = (a * b) - (c * d);
    System.out.println("RESULTADO = " + result);
  }
}
