package sections.section1a9.entities;

public class Rectangle {
  public double width;
  public double height;

  public double Area() {
    return width * height;
  }

  public double Perimeter() {
    return (width + height) * 2;
  }

  public double diagonal() {
    return Math.sqrt(width * width + height *  height);
  }
}
