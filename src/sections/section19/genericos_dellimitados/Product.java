package sections.section19.genericos_dellimitados;

import org.jetbrains.annotations.NotNull;

public class Product implements Comparable<Product> {
  private String name;
  private Double price;

  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return name + ", " + String.format("%.2f", price);
  }

  @Override
  public int compareTo(@NotNull Product other) {
    return price.compareTo(other.getPrice());
  }
}