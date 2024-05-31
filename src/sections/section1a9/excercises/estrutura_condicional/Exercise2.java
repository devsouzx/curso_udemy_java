package sections.section1a9.excercises.estrutura_condicional;

import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();

    if (x % 2 == 0) {
      System.out.println("PAR");
    } else {
      System.out.println("IMPAR");
    }

    sc.close();
  }
}
