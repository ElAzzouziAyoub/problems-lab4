package student;

public class Major {
  private static int nextId = 1;
  private int id;
  private String code;
  private String name;
  private Student[] students;
  private int studentCount;

  public Major(String code, String name) {
    this.code = code;
    this.name = name;
    this.students = new Student[50];
    this.studentCount = 0;
  }

  // Method to add a student
  public void addStudent(Student s) {
    if (studentCount < 50) {
      this.students[studentCount] = s;
      this.studentCount++;
    } else {
      System.out.println("Cant add more students to this major !");
    }
  }

  // Getters

  public String getCode() {
    return this.code;
  }

  public String getName() {
    return this.name;
  }

  // Display all students in the major
  public void displayStudents() {
    System.out.println("-------------------" + this.name + " Major Students -----------------");
    for (int i = 0; i < studentCount; i++) {
      System.out.println((i + 1) + ". " + students[i]);
    }
    System.out.println("--------------------------------------------");
  }

  // Find Student by CNE
  public void findStudentByCNE(String cne) {
    for (int i = 0; i < this.studentCount; i++) {
      if (students[i].getCne() == cne) {
        System.out.println(students[i]);
      }
    }
  }

  // get the number of enrolled students
  public int getStudentCount() {
    return this.studentCount;
  }

  // Remove Student By CNE
  public boolean removeStudentByCNE(String cne) {
    int index = -1;
    for (int i = 0; i < this.studentCount; i++) {
      if (this.students[i].getCne().equals(cne)) {
        index = i;
      }
    }

    if (index == -1) {
      return false;
    } else {
      for (int k = index; k < this.studentCount - 1; k++) {
        this.students[k] = this.students[k + 1];
      }
      this.studentCount--;
      return true;
    }
  }

  public void getOccupancyRate() {
    System.out.println(this.name + "capacity :" + this.students.length + " students");
    System.out.println("Current enrollement : " + this.studentCount);
    System.out.println(
        "OccupancyRate :" + ((double) this.studentCount / this.students.length) * 100 + " % ");
  }

  public String getStudentListAsString() {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < this.studentCount; i++) {
      sb.append(this.students[i].getId()) // student id
          .append(" ")
          .append(this.students[i].getCne()) // student CNE
          .append(" ")
          .append(this.students[i].getFullNameFormatted()) // formatted name
          .append("\n"); // line break
    }

    return sb.toString();
  }
}
