package sections.section1a9.excercises.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos alunos serao digitados? ");
    int n = sc.nextInt();

    String[] name = new String[n];
    double[] grade1 = new double[n];
    double[] grade2 = new double[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
      sc.nextLine();
      name[i] = sc.nextLine();
      grade1[i] = sc.nextDouble();
      grade2[i] = sc.nextDouble();
    }

    double media = 0;
    for (int i = 0; i < n; i++) {
      media = (grade1[i] + grade2[i]) / n;
      if (media >= 6.0) {
        System.out.println(name[i]);
      }
    }

    sc.close();
  }
}
