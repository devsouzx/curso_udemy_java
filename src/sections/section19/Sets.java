package sections.section19;

import java.util.*;

public class Sets {
  public static void main(String[] args) {
    Set<Product> set = new HashSet<>();

    set.add(new Product("TV", 900.0));
    set.add(new Product("Notebook", 1200.0));
    set.add(new Product("Tablet", 400.0));

    Product prod = new Product("Notebook", 1200.0);

    System.out.println(set.contains(prod));
  }

  public static void second(String[] args) {
    Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
    Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
    //union
    Set<Integer> c = new TreeSet<>(a);
    c.addAll(b);
    System.out.println(c);
    //intersection
    Set<Integer> d = new TreeSet<>(a);
    d.retainAll(b);
    System.out.println(d);
    //difference
    Set<Integer> e = new TreeSet<>(a);
    e.removeAll(b);
    System.out.println(e);
  }

  public static void first(String[] args) {
    Set<String> set = new LinkedHashSet<>();
    set.add("Tv");
    set.add("Tablet");
    set.add("Notebook");

    set.removeIf(x -> x.charAt(0) == 'T');

    for (String p : set) {
      System.out.println(p);
    }
  }
}
