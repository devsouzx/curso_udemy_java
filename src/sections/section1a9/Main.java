package sections.section1a9;

public class Main {
  public static void main(String[] args) {
    int age = 17;
    double height = 1.80;
    float height1 = 1.83f;
    char sex = 'M';
    float sum = (float) height + height1;
    /*
      Numerical:
       byte = 8bits = -127 a 127
       short = 16bits = -32768 a 32767
       int = 32bits = -2147483648 a 2147483647
       long = 64bits
       float = 32bits
       double = 64bits
       char = 16bits
       boolean = 1bit
    */
    System.out.println(height + " + " + height1);
    System.out.printf("%.4f%n", sum);
    System.out.printf("%.4f%n", sum);
    System.out.printf("Result = %.2f metros%n", sum);
    String nome = "maria";
    int age1 = 31;
    double money = 4356.46;
    System.out.printf("%s is %d and gain %.2f dollars %n", nome, age1, money);

    double A, B, C, x, y, z;
    x = 9;
    y = 2;
    z = -4;
    A = Math.sqrt(x); // raiz quadrada
    B = Math.pow(x, y); // x elevado a y
    C = Math.abs(z); // tira -
    System.out.println("Raiz quadrada de " + x + " = " + A);
    System.out.println(x + " elevado a " + y + " = " + B);
    System.out.println(C);

    double delta, x1, x2, a, b, c;
    a = 3;
    b = 5;
    c = 7;
    delta = Math.pow(b, 2.0) - 4 * c * a;
    x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
    x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
    System.out.println(x1);
    System.out.println(x2);
  }
}