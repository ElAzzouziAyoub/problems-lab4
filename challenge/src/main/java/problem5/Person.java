package student;

public class Person {
  private static int nextId = 1;
  private int id;
  private String firstName;
  private String secondName;
  private String phone;
  private String email;

  public Person() {
    this.id = nextId++;
  }

  public Person(String firstName, String secondName, String telephone, String email) {
    this.id = nextId++;
    this.firstName = firstName;
    this.secondName = secondName;
    this.phone = telephone;
    this.email = email;
  }

  // Getter and Setter for id
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  // Getter and Setter for firstName
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  // Getter and Setter for secondName
  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  // Getter and Setter for phone
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  // Getter and Setter for email
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return firstName + " " + secondName + " : " + phone + " : " + email;
  }
}
