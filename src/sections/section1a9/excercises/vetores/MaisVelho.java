package sections.section1a9.excercises.vetores;

import java.util.Scanner;

public class MaisVelho {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas voce vai digitar? ");
    int n = sc.nextInt();

    String[] vectA = new String[n];
    int[] vectB = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Dados da " + (i + 1) + "a pessoa:");
      sc.nextLine();
      System.out.print("Nome: ");
      vectA[i] = sc.nextLine();
      System.out.print("Idade: ");
      vectB[i] = sc.nextInt();
    }

    int maior = 0;
    int posmaior = 0;
    for (int i = 0; i < n; i++) {
      if (vectB[i] > maior) {
        maior = vectB[i];
        posmaior = i;
      }
    }
    System.out.println("PESSOA MAIS VELHA: " + vectA[posmaior]);

    sc.close();
  }
}
