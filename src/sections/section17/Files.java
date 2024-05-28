package sections.section17;

import java.io.*;
import java.util.Scanner;

public class Files {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter folder path: ");
    String strPath = sc.nextLine();
    File path = new File(strPath);

    System.out.println(path.getName());
    System.out.println(path.getParent());
    System.out.println(path.getPath());

    sc.close();
  }

  private static void folders() {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter folder path: ");
    String strPath = sc.nextLine();
    File path = new File(strPath);
    File[] folders = path.listFiles(File::isDirectory);
    for (File folder : folders) {
      System.out.println(folder);
    }

    File[] files = path.listFiles(File::isFile);
    for (File file : files) {
      System.out.println(file);
    }

    boolean success = new File(strPath, "\\subkdir").mkdir();
    System.out.println(success);

    sc.close();
  }

  private static void writers() {
    String[] lines = new String[] {"good morning", "good afternoon", "good night"};
    String path = "c:\\temp\\in.txt";

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
      for (String line : lines) {
        bw.write(line);
        bw.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void tryWithResources() {
    String path = "c:\\temp\\in.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();

      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  private static void bufferedFiles() {
    String path = "c:\\temp\\oin.txt";
    FileReader fr = null;
    BufferedReader br = null;

    try {
      fr = new FileReader(path);
      br = new BufferedReader(fr);

      String line = br.readLine();

      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if (br != null) {
          br.close();
        }
        if (fr != null) {
          fr.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  private static void files() {
    File file = new File("c:\\Windows\\csup.txt");
    Scanner sc = null;
    try {
      sc = new Scanner(file);
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
  }
}
