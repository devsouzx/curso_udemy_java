package sections.section1a9.excercises.poo;

import sections.section1a9.entities.Employee;

import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Employee employee = new Employee();

    System.out.print("Name: ");
    employee.name = sc.nextLine();

    System.out.print("Gross salary: ");
    employee.grossSalary = sc.nextDouble();

    System.out.print("Tax: ");
    employee.tax = sc.nextDouble();

    System.out.println();
    System.out.println("Employee: " + employee);

    System.out.println();
    System.out.print("Which percent to increase salary: ");
    double percent = sc.nextDouble();
    employee.increaseSalary(percent);

    System.out.println();
    System.out.println("Updated data: " + employee);

    sc.close();
  }
}
