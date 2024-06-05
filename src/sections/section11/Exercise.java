package sections.section11;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("What day were you born? (1-31) ");
    int day = sc.nextInt();
    System.out.print("What month were you born? (1-12) ");
    int month = sc.nextInt();
    System.out.print("What year were you born? ");
    int year = sc.nextInt();

    LocalDate dateBorn = LocalDate.of(year, month, day);
    LocalDate dateNow = LocalDate.now();

    Duration duration = Duration.between(dateBorn.atStartOfDay(), dateNow.atStartOfDay());

    if (dateBorn.getDayOfMonth() == dateNow.getDayOfMonth() && dateBorn.getMonth() == dateNow.getMonth()) {
      System.out.println("Happy Birthday, today is your birthday");
      System.out.println("You are " + duration.toDays() / 365);
    } else {
      System.out.println("You are now " + duration.toDays() / 365);
    }

    sc.close();
  }
}