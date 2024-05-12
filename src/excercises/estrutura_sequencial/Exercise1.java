package excercises.estrutura_sequencial;

import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x, y, result;
    x = sc.nextInt();
    sc.nextLine();
    y = sc.nextInt();
    result = x + y;
    System.out.println("SOMA = " + result);
  }
}
