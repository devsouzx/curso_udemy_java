package excercises.vetores;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoais {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas serao digitadas? ");
    int n = sc.nextInt();

    double[] height = new double[n];
    char[] gender = new char[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Altura da " + (i + 1) + "a pessoa: ");
      height[i] = sc.nextDouble();
      System.out.print("Genero da " + (i + 1) + "a pessoa: ");
      gender[i] = sc.next().charAt(0);
    }

    double menor = 0;
    for (int i = 0; i < n; i++) {
      if (height[i] < menor) {
        menor = height[i];
      }
    }

    double maior = 0;
    for (int i = 0; i < n; i++) {
      if (height[i] > maior) {
        maior = height[i];
      }
    }

    double sum = 0;
    int quantity = 0;
    int men = 0;
    for (int i = 0; i < n; i++) {
      if (gender[i] == 'f') {
        sum += height[i];
        quantity++;
      } else {
        men++;
      }
    }
    double avg = sum / quantity;

    System.out.printf("Menor altura = %.2f%n", menor);
    System.out.printf("Maior altura = %.2f%n", maior);
    System.out.printf("Media das alturas das mulheres = %.2f%n", avg);
    System.out.println("Numero de homens = " + men);

    sc.close();
  }
}
