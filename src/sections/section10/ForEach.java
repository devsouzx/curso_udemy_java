package sections.section10;

public class ForEach {
  public static void main(String[] args) {
    String vect[] = new String[] {"MAria", "bob", "alex"};

    for (int i = 0; i < vect.length; i++) {
      System.out.println(vect[i]);
    }

    for (String obj : vect) {
      System.out.println(obj);
    }
  }
}
