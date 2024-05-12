package sections.section1a9;

import java.util.Scanner;

public class EstruturasRepetitivas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = 0;
    while (x != 0) {
      y += x;
      x = sc.nextInt();
    }
    System.out.println(y);

    int N = sc.nextInt();

    int sum = 0;
    for (int i = 0; i < N; i++) {
      x = sc.nextInt();
     sum = sum + x;
   }
    System.out.println(sum);

    char resp;
    do {
      System.out.println("digita a temperatura em celsius: ");
      double C = sc.nextDouble();
      double F = 9 * C / 5 + 32;
      System.out.printf("Farenreit: %.2f%n", F);
      System.out.println("quer repitir (s/n)? ");
      resp = sc.next().charAt(0);
    } while (resp != 'n');

    sc.close();
  }
}
