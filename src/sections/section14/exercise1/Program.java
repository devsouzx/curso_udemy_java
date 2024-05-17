package sections.section14.exercise1;

import sections.section14.exercise1.entities.Employee;
import sections.section14.exercise1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Employee> employees = new ArrayList<>();

    System.out.print("Enter the number of employees: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Employee #" + i + " data:");
      System.out.print("Outsourced (y/n)? ");
      char outsourced = sc.next().charAt(0);
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Hours: ");
      int hours = sc.nextInt();
      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();
      double additionalCharge;
      if (outsourced == 'y') {
        System.out.print("Additional charge: ");
        additionalCharge = sc.nextDouble();
        employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
      } else {
        employees.add(new Employee(name, hours, valuePerHour));
      }
    }

    System.out.println();
    System.out.println("PAYMENTS:");
    for (Employee employee : employees) {
      System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
    }

    sc.close();
  }
}
