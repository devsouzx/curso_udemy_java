package excercises;

import entities.Employee;
import entities.EmployeeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class LIstsExercises {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("How many employees will be registered? ");
    int n = sc.nextInt();

    List<EmployeeList> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      System.out.println("Employee #" + (i + 1));
      System.out.print("Id: ");
      int id = sc.nextInt();
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Salary: ");
      double salary = sc.nextDouble();
      list.add(new EmployeeList(id, name, salary));
    }
    System.out.println();

    System.out.print("Enter the employee id that will have salary increase: ");
    int id = sc.nextInt();
    EmployeeList employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    if (employee == null) {
      System.out.println("This id does not exist!");
    } else {
      System.out.print("Enter the percentage: ");
      double percentage = sc.nextDouble();
      employee.increaseSalary(percentage);
    }

    System.out.println();
    System.out.println("List of employees: ");
    for (EmployeeList x : list) {
      System.out.println(x);
    }

    sc.close();
  }
}
