package sections.section14.exercise2;

import sections.section14.exercise2.entities.ImportedProduct;
import sections.section14.exercise2.entities.Product;
import sections.section14.exercise2.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Product> products = new ArrayList<>();

    System.out.print("Enter the number of products: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.print("Common, used or imported (c/u/i)? ");
      char type = sc.next().charAt(0);
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Price: ");
      double price = sc.nextDouble();
      if (type == 'i') {
        System.out.print("Customs fee: ");
        double customFee = sc.nextDouble();
        products.add(new ImportedProduct(name, price, customFee));
      } else if (type == 'u') {
        System.out.print("Manufacture date (DD/MM/YYYY): ");
        LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        products.add(new UsedProduct(name, price, date));
      } else {
        products.add(new Product(name, price));
      }
    }

    System.out.println();
    System.out.println("PRICE TAGS:");
    for (Product product : products) {
      System.out.println(product.priceTag());
    }

    sc.close();
  }
}
