package sections.section19.hashCodAndEquals;

public class HashCodeAndEquals {
  public static void main(String[] args) {
    String a = "Maria";
    String b = "Alex";
    System.out.println(a.equals(b));
    System.out.println(a.hashCode());
    System.out.println(b.hashCode());
  }
}
