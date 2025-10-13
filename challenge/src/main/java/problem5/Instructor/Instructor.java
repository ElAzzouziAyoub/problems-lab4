package Instructor;

public class Instructor extends Person {
  private String employeeNumber;

  public void cleanEmployeeNumber() {
    this.employeeNumber = this.employeeNumber.trim();
  }

  public String summaryLine() {
    return String.format(
        "Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
        this.cleanEmployeeNumber(), this.getSecondName(), this.getFirstName());
  }
}
