package excercises.vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();

    int[] vect = new int[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um numero: ");
      vect[i] = sc.nextInt();
    }

    int sum = 0;
    int quantity = 0;
    for (int i = 0; i < vect.length; i++) {
      if (vect[i] % 2 == 0) {
        sum += vect[i];
        quantity++;
      }
    }
    double avg = (double) sum / quantity;
    if (quantity > 0) {
      System.out.printf("MEDIA DOS PARES = %.2f%n", avg);
    } else {
      System.out.println("NENHUM NUMERO PAR");
    }

    sc.close();
  }
}
