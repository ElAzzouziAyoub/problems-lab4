package problem5;

public class Student extends Person {
  private String cne;
  private Major major;

  public static final Major cs = new Major("23", "Computer Science");

  public Student(
      String nom, String prenom, String telephone, String email, String cne, Major major) {
    super(nom, prenom, telephone, email);
    this.cne = cne;
    this.major = major;
    major.addStudent(this);
  }

  public Student(String nom, String prenom, String telephone, String email, String cne) {
    super(nom, prenom, telephone, email);
    this.cne = cne;
    cs.addStudent(this);
  }

  // Getters

  public String getCne() {
    return this.cne;
  }

  public Major getMajor() {
    return this.major;
  }

  // Setters

  public void setCNE(String cne) {
    this.cne = cne;
  }

  public void setMajor(Major major) {
    this.major = major;
  }

  // FormatName
  public String getFullNameFormatted() {
    return String.format(" %s %s ", super.getSecondName().toUpperCase(), super.getFirstName());
  }

  @Override
  public String toString() {
    return this.cne + " " + this.getFullNameFormatted();
  }
}
