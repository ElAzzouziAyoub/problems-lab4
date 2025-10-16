package problem6.Shapes;

public class Square implements Forme {
  private double a;

  public Square(double a) {
    this.a = a;
  }

  public double getSurface() {
    return this.a * this.a;
  }
}
