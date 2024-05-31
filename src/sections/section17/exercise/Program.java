package sections.section17.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Product> list = new ArrayList<>();
    String strFile = sc.nextLine();

    File path = new File(strFile);
    String folder = path.getParent();

    boolean success = new File (folder, "\\out").mkdir();

    String target = folder + "\\out\\summary.csv";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String itemCsv = br.readLine();
      while (itemCsv != null) {
        String[] fields = itemCsv.split(",");

        String name = fields[0];
        Double price = Double.parseDouble(fields[1]);
        Integer quantity = Integer.parseInt(fields[2]);

        list.add(new Product(name, price, quantity));

        itemCsv = br.readLine();
      }

      try (BufferedWriter bw = new BufferedWriter(new FileWriter(target))) {
        for (Product product : list) {
          bw.write(product.getName() + "," + String.format("%.2f", product.total()));
          bw.newLine();
        }

        System.out.println(target + " CREATED");
      } catch (IOException e) {
        System.out.println("Error writing file: " + e.getMessage());
      }
    } catch (IOException e) {
      System.out.println(e);
    }

    sc.close();
  }
}
