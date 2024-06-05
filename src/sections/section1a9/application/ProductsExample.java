package sections.section1a9.application;

import sections.section1a9.entities.Product;

import java.util.Scanner;

public class ProductsExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Price: ");
    double price = sc.nextDouble();

    Product product = new Product(name, price);
    product.setName("car");
    product.setPrice(1234);

    System.out.println();
    System.out.println("Product data: " + product);

    System.out.println();
    System.out.println("Enter the number of products to be added in stock: ");
    int quantity = sc.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.println("Updated data: " + product);

    System.out.println();
    System.out.print("Enter the number of products to be removed from stock: ");
    quantity = sc.nextInt();
    product.removeProducts(quantity);

    System.out.println();
    System.out.println("Updated data: " + product);

    sc.close();
  }
}
