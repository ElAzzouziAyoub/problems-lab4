package problem7.Jobs;

public class Carpenter implements Person {
  private String name;

  public Carpenter(String name) {
    this.name = name;
  }

  public void display() {
    System.out.println(String.format("I am %s the Carpenter", this.name));
  }
}
