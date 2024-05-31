package sections.section1a9.excercises.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double A, B, C, triangle, circle, trapeze, square, rectangle, pi = 3.14159;
    A = sc.nextDouble();
    B = sc.nextDouble();
    C = sc.nextDouble();

    triangle = (A * C) / 2;
    circle = C * C * pi;
    trapeze = ((A + B) * C) / 2;
    square = B * B;
    rectangle = A * B;

    System.out.printf("TRIANGLE: %.3f%n", triangle);
    System.out.printf("CIRCLE: %.3f%n", circle);
    System.out.printf("TRAPEZE: %.3f%n", trapeze);
    System.out.printf("SQUARE: %.3f%n", square);
    System.out.printf("RECTANGLE: %.3f%n", rectangle);

    sc.close();
  }
}
