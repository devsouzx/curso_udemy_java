package sections.section18.herdar;

import sections.section14.exercise3.entities.Color;

public abstract class AbstractShape implements Shape {
  private Color color;

  public AbstractShape(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }
}
