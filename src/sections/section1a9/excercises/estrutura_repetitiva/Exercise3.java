package sections.section1a9.excercises.estrutura_repetitiva;

import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;

    while (x != 4) {
      if (x == 1) {
        alcool++;
      } else if (x == 2) {
        gasolina++;
      } else if (x == 3) {
        diesel++;
      }

      x = sc.nextInt();
    }

    System.out.println("MUITO OBRIGADO");
    System.out.println("ALCOOL: " + alcool);
    System.out.println("GASOLINA: " + gasolina);
    System.out.println("DIESEL: " + diesel);

    sc.close();
  }
}
