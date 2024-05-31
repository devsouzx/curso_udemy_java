package sections.section1a9.excercises.estrutura_condicional;

import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int firstHour = sc.nextInt();
    int lastHour = sc.nextInt();

    int hoursPlaying = 24 - (firstHour - lastHour);

    if (hoursPlaying <= 24 && hoursPlaying >= 1) {
      System.out.println("O JOGO DUROU " + hoursPlaying + " HORAS");
    } else {
      hoursPlaying = lastHour - firstHour;
      System.out.println("O JOGO DUROU " + hoursPlaying + " HORAS");
    }

    sc.close();
  }
}
