package problem6;

import problem6.Shapes.Circle;
import problem6.Shapes.Forme;
import problem6.Shapes.Square;

public class Test {
  public static void main(String[] argv) {
    Forme[] figures = new Forme[3];
    figures[0] = new Square(2);
    figures[1] = new Circle(3);
    figures[2] = new Square(5.2);
    for (int i = 0; i < figures.length; i++)
      System.out.println(figures[i] + " : area = " + figures[i].getSurface() + " cm2");
  }
}
