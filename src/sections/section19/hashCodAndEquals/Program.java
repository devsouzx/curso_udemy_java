package sections.section19.hashCodAndEquals;

public class Program {
  public static void main(String[] args) {
    Client client1 = new Client("Maria", "asdasdasd");
    Client client2 = new Client("Maria", "asdasdasd");

    String s1 = new String("asd");
    String s2 = new String("asd");

    System.out.println(client1.hashCode());
    System.out.println(client2.hashCode());
    System.out.println(client1.equals(client2));
    System.out.println(client1 == client2);
    System.out.println(s1 == s2);
  }
}
