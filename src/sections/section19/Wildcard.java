package sections.section19;

import java.util.Arrays;
import java.util.List;

public class Wildcard {
  public static void main(String[] args) {
    List<String> myInts = Arrays.asList("maria");
    printList(myInts);
  }
  public static void printList(List<?> list) {
    for (Object obj : list) {
      System.out.println(obj);
    }
  }
}
