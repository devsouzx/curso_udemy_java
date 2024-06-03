package sections.section19.exercise1_set;

import java.io.*;
import java.time.Instant;
import java.util.*;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter file full path: ");
    String path = sc.nextLine();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      Set<User> users = new HashSet<>();
      String line = br.readLine();

     while (line != null) {
       String[] fields = line.split(" ");

       String name = fields[0];
       Date login = Date.from(Instant.parse(fields[1]));

       users.add(new User(name, login));

       line = br.readLine();
     }
      System.out.println("Total users: " + users.size());
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }

    sc.close();
  }
}
