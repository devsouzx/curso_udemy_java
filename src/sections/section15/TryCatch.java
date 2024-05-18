package sections.section15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
  public static void main(String[] args) {
    method1();

    System.out.println("fim");
  }

  public static void method1() {
    System.out.println("===Method 1 starts===");
    method2();
    System.out.println("===Method 1 ends===");
  }

  public static void method2() {
    System.out.println("===Method 2 starts===");
    Scanner sc = new Scanner(System.in);

    try {
      String[] vect = sc.nextLine().split(" ");
      int position = sc.nextInt();
      System.out.println(vect[position]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid position!");
      e.printStackTrace();
      sc.next();
    } catch (InputMismatchException e) {
      System.out.println("Input error!");
    }

    sc.close();
    System.out.println("===Method 2 ends===");
  }
}
