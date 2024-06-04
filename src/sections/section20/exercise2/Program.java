package sections.section20.exercise2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter full file path: ");
    String path = sc.nextLine();
    System.out.print("Enter salary: ");
    double salary = sc.nextDouble();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();

      List<Employee> employees = new ArrayList<>();
      while (line != null) {
        String[] fields = line.split(",");
        employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
        line = br.readLine();
      }

      System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
      List<String> emails = employees.stream()
              .filter(x -> x.getSalary() > salary)
              .map(Employee::getEmail).sorted()
              .toList();

      emails.forEach(System.out::println);

      double sum = employees.stream()
              .filter(x -> x.getName().charAt(0) == 'M')
              .map(Employee::getSalary)
              .reduce(0.0, Double::sum);

      System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    sc.close();
  }
}
