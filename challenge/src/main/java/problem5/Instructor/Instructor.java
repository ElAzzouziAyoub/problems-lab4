package problem5.Instructor;

import problem5.Person;

public class Instructor extends Person {

  private String employeeNumber;
  private Subject subject;

  public Instructor(
      String firstName,
      String secondName,
      String telephone,
      String email,
      String employeeNumber,
      Subject subject) {
    super(firstName, secondName, telephone, email);
    this.employeeNumber = employeeNumber;
    this.subject = subject;
  }

  public String cleanEmployeeNumber() {
    this.employeeNumber = this.employeeNumber.trim();
    return this.employeeNumber;
  }

  public String summaryLine() {
    return String.format(
        "Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
        this.cleanEmployeeNumber(), this.getSecondName(), this.getFirstName());
  }

  public String toCard() {
    StringBuilder sb = new StringBuilder();
    sb.append("Instructor \n");
    sb.append("-------------------\n");
    sb.append(String.format("Employee #: %s \n", this.cleanEmployeeNumber()));
    sb.append(String.format("Name : %s , %s \n", this.getSecondName(), this.getFirstName()));
    sb.append(String.format("Email : %s \n", this.getEmail()));
    sb.append(String.format("Phone : %s", this.getPhone()));
    return sb.toString();
  }
}
