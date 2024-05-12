package sections.section11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static java.time.Instant.parse;

public class DataHora {
  public static void main(String[] args) {
    // https://docs.oracle.com/en%2Fjava%2Fjavase%2F22%2Fdocs%2Fapi%2F%2F/java.base/java/time/format/DateTimeFormatter.html

    LocalDate d01 = LocalDate.now();
    LocalDateTime d02 = LocalDateTime.now();
    Instant d03 = Instant.now();

    LocalDate d04 = LocalDate.parse("2024-05-09");
    LocalDateTime d05 = LocalDateTime.parse("2024-05-09T01:32:23");
    Instant d06 = parse("2024-05-09T01:32:23Z");
    Instant d07 = parse("2024-05-09T01:32:23-03:00");
    LocalDate d08 = LocalDate.parse("23/04/2009", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    LocalDateTime d09 = LocalDateTime.parse("23/04/2000 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

    LocalDate d10 = LocalDate.of(2023, 5, 9);
    LocalDateTime d11 = LocalDateTime.of(2024, 5, 9, 18, 30);

    System.out.println(d01);
    System.out.println(d02);
    System.out.println(d03);
    System.out.println(d04);
    System.out.println(d05);
    System.out.println(d06);
    System.out.println(d07);
    System.out.println(d08);
    System.out.println(d09);
    System.out.println(d10);
    System.out.println(d11);

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
    DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
    DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

    System.out.println(d04.format(fmt1));
    System.out.println(fmt1.format(d04));
    System.out.println(d05.format(fmt2));
    System.out.println(d05.format(fmt4));
    System.out.println(fmt2.format(d05));
    System.out.println(fmt3.format(d06));
    System.out.println(fmt5.format(d06));

    LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
    LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
    LocalDateTime r3= LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
    LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println(r4);

    System.out.println(d04.getDayOfMonth());
    System.out.println(d04.getMonthValue());
    System.out.println(d04.getMonth());
    System.out.println(d04.getYear());
    System.out.println(d04.getDayOfYear());
    System.out.println(d05.getHour());
    System.out.println(d05.getMinute());
    System.out.println(d05.getSecond());
    System.out.println(d05.getNano());

    System.out.println(d04.minusWeeks(1));
    System.out.println(d04.minusDays(4));
    System.out.println(d04.plusMonths(4));
    System.out.println(d04.plusYears(244));
    System.out.println(d05.minusMinutes(25));
    System.out.println(d05.plusSeconds(35));
    System.out.println(d05.plusNanos(345));
    System.out.println(d06.minus(7, ChronoUnit.DAYS));
    System.out.println(d06.plus(7, ChronoUnit.DAYS));

    LocalDateTime pastWeek = d05.minusWeeks(1);
    Duration t1 = Duration.between(pastWeek, d05);
    System.out.println(t1.toDays());

    LocalDate pastWeekDate = d04.minusWeeks(1);
    Duration t2 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay());
    System.out.println(t2.toDays());

    Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
    Duration t3 = Duration.between(pastWeekInstant, d06);
    System.out.println(t3.toDays());
  }
}
