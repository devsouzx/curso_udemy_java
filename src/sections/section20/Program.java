package sections.section20;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    ProductService ps = new ProductService();

    double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

    System.out.println("Sum = " + String.format("%.2f", sum));
  }

  public static void first(String[] args) {
    List<Product> list = new ArrayList<>();

    list.add(new Product("TV", 900.0));
    list.add(new Product("Notebook", 1200.0));
    list.add(new Product("Tablet", 400.0));;

    list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

    for (Product p : list) {
      System.out.println(p);
    }
  }
}
