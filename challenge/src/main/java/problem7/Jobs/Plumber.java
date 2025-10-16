package problem7.Jobs;

public class Plumber implements Person {
  private String name;

  public Plumber(String name) {
    this.name = name;
  }

  public void display() {
    System.out.println(String.format("I am %s the Plumber", this.name));
  }
}
