package student;

public class Test {
  public static void main(String[] args) {
    // Create a couple of majors
    Major math = new Major("11", "Mathematics");
    Major cs = Student.cs;

    // Create some students associated with these majors
    Student s1 = new Student("Safi", "Amal", "0612345678", "amal.safi@email.com", "22885676");
    Student s2 = new Student("Alami", "Samir", "0698765432", "samir.alami@email.com", "23585976");
    Student s3 =
        new Student("Hassan", "Ali", "0655555555", "ali.hassan@email.com", "21885432", math);

    // Display computer science students
    cs.displayStudents();
    math.displayStudents();
    cs.removeStudentByCNE("23585976");
    cs.displayStudents();
    cs.getOccupancyRate();
    System.out.println("Getting student as a string list ");
    System.out.println(cs.getStudentListAsString());
  }
}
