package excercises.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double area, raio, pi;

    raio = sc.nextDouble();
    pi = 3.14159;
    area = pi * Math.pow(raio, 2.0);
    System.out.printf("A=%.4f%n", area);
    sc.close();
  }
}
