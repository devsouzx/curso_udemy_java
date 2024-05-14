package sections.section13.exercise1;

import sections.section13.exercise1.entities.Department;
import sections.section13.exercise1.entities.HourContract;
import sections.section13.exercise1.entities.Worker;
import sections.section13.exercise1.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Enter department's name: ");
    String department = sc.nextLine();
    System.out.println("Enter worker data: ");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Level: ");
    String level = sc.nextLine();
    System.out.print("Base salary: ");
    double baseSalary = sc.nextDouble();
    Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

    System.out.print("How many contracts to this worker? ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Enter contract #" + i + " data:");
      System.out.print("Date (DD/MM/YYYY): ");
      Date date = format.parse(sc.next());
      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();
      System.out.print("Duration (hours): ");
      int hours = sc.nextInt();
      HourContract contract = new HourContract(date, valuePerHour, hours);
      worker.addContract(contract);
    }

    System.out.println();
    System.out.print("Enter month and year to calculate income (MM/YYYY): ");
    String date = sc.next();
    int month = Integer.parseInt(date.substring(0, 2));
    int year = Integer.parseInt(date.substring(3));
    System.out.println("Name: " + worker.getName());
    System.out.println("Department: " + worker.getDepartment().getName());
    System.out.println("Income for " + date + ": " + worker.income(year, month));

    sc.close();
  }
}
