package sections.section10;

import java.util.ArrayList;
import java.util.List;

public class Lists {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("Joao");
    list.add("Pedro");
    list.add("Alex");
    list.add("Alok");
    list.add(2, "Marcos");

    System.out.println(list.size());

    for (String x : list) {
      System.out.println(x);
    }
    System.out.println("--------------------------");
    list.removeIf(x -> x.charAt(0) == 'M');

    for (String x : list) {
      System.out.println(x);
    }

    System.out.println(list.indexOf("Joao"));
    List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
    for (String x : result) {
      System.out.println(x);
    }

    String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
    System.out.println(name);
  }
}
