package sections.section1a9;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

//    String x = sc.next();
//    System.out.println(x);
//    int y = sc.nextInt();
//    System.out.println(y);
//    double z = sc.nextDouble();
//    System.out.println(z);
//    char a = sc.next().charAt(0);
//    System.out.println(a);

    String x, y, z;
    int i;
    i = sc.nextInt();
    sc.nextLine();
    x = sc.nextLine();
    y = sc.nextLine();
    z = sc.nextLine();
    System.out.println(i);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    sc.close();
  }
}
