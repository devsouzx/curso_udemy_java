package sections.section1a9;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasCondicionais {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
//    int hour;
//
//    System.out.println("QUantas horas?");
//    hour = sc.nextInt();
//    if(hour < 12){
//      System.out.println("bom dia");
//    } else if(hour > 12 && hour < 18){
//      System.out.println("boa tarde");
//    } else {
//      System.out.println("boa noite");
//    }

//    int minutos = sc.nextInt();
//
//    double conta = 50.0;
//    if (minutos > 100) {
//      conta += (minutos - 100) * 2;
//      System.out.println(conta);
//    } else {
//      System.out.println(conta);
//    }

    int x = sc.nextInt();
    String day = "";
    switch (x) {
      case 1:
        day = "sjdsas";
        break;
      case 2:
        day = "eer";
        break;
    }
    System.out.println("gdfg" + day);

    int z = 5 > 4 ? 200 : 423;
    System.out.println(z);
  }
}
