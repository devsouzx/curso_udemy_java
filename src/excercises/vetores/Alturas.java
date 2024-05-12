package excercises.vetores;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas serao digitadas? ");
    int n = sc.nextInt();

    Person[] vect = new Person[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.println("Dados da " + (i + 1) + "a pessoa");
      System.out.print("Nome: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Idade: ");
      int age = sc.nextInt();
      System.out.print("Altura: ");
      double height = sc.nextDouble();
      vect[i] = new Person(name, age, height);
    }
    System.out.println();

    double sum = 0;
    for (int i = 0; i < vect.length; i++) {
      sum += vect[i].getHeight();
    }
    double avg = sum / vect.length;
    System.out.printf("Altura média: %.2f%n", avg);

    int peopleLess16 = 0;
    for (int i = 0; i < vect.length; i++) {
      if (vect[i].getAge() < 16) {
        peopleLess16++;
      }
    }
    double percent = 100.0 / vect.length * peopleLess16;
    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percent);

    for (int i = 0; i < vect.length; i++) {
      if (vect[i].getAge() < 16) {
        System.out.println(vect[i].getName());
      }
    }

    sc.close();
  }
}
