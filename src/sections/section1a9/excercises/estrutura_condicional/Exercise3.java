package sections.section1a9.excercises.estrutura_condicional;

import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    if (A % B == 0 || B % A == 0) {
      System.out.println("Sao Mutiplos");
    } else {
      System.out.println("Nao Sao Mutiplos");
    }

    sc.close();
  }
}
