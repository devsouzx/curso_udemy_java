package sections.section20.exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter full file path: ");
    String path = sc.nextLine();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();

      List<Product> products = new ArrayList<>();
      while (line != null) {
        String[] fields = line.split(",");

        products.add(new Product(fields[0], Double.parseDouble(fields[1])));

        line = br.readLine();
      }

      double media = products.stream()
              .map(Product::getPrice)
              .reduce(0.0, Double::sum) / products.size();

      System.out.println("Average price: " + String.format("%.2f", media));

      Comparator<String> c = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

      List<String> names = products.stream()
              .filter(x -> x.getPrice() < media)
              .map(Product::getName).sorted(c.reversed())
              .toList();

      names.forEach(System.out::println);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    sc.close();
  }
}

