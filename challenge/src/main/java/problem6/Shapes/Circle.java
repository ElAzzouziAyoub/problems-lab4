package problem6.Shapes;

public class Circle implements Forme {
  private double PI = 3.141;
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getSurface() {
    return PI * this.radius * this.radius;
  }
}
