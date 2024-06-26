package sections.section1a9.excercises.poo;

import sections.section1a9.entities.Rectangle;

import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Rectangle rectangle = new Rectangle();

    System.out.println("Enter rectangle width and height: ");
    rectangle.width = sc.nextDouble();
    rectangle.height = sc.nextDouble();

    System.out.printf("AREA = %.2f%n", rectangle.Area());
    System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter());
    System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());

    sc.close();
  }
}
