package sections.section1a9.excercises.poo;

import sections.section1a9.entities.Student;

import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Student student = new Student();

    student.name = sc.nextLine();
    student.grade1 = sc.nextDouble();
    student.grade2 = sc.nextDouble();
    student.grade3 = sc.nextDouble();

    System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

    if (student.finalGrade() < 60) {
      System.out.println("FAILED");
      System.out.printf("MISSING %.2f", student.missingPoints());
    } else {
      System.out.println("PASSED");
    }

    sc.close();
  }
}
