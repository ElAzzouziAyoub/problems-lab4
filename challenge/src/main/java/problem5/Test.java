package problem5;

import problem5.Instructor.Instructor;
import problem5.Instructor.Subject;

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

    System.out.println("=== Testing Instructor and Subject ===\n");

    // Test 1: Create Instructor and test methods
    Instructor inst =
        new Instructor(
            "John", // firstName
            "Smith", // secondName
            "555-1234", // telephone
            "john@uni.edu", // email
            "  EMP123  ", // employeeNumber (with spaces)
            null // subject (will set later)
            );

    System.out.println("1. cleanEmployeeNumber() - trim whitespace:");
    System.out.println("   Result: '" + inst.cleanEmployeeNumber() + "'");
    System.out.println();

    System.out.println("2. summaryLine():");
    System.out.println("   " + inst.summaryLine());
    System.out.println();

    System.out.println("3. toCard():");
    System.out.println(inst.toCard());
    System.out.println();

    // Test 2: Create Subject with intro course
    Subject subj1 =
        new Subject(
            101, // id
            "  cs101  ", // code (with spaces)
            "introduction to programming", // title
            inst // instructor
            );

    System.out.println("4. normalizedCode() - uppercase and trim:");
    System.out.println("   Result: '" + subj1.normalizedCode() + "'");
    System.out.println();

    System.out.println("5. capitalizeWords():");
    System.out.println("   Original: 'introduction to programming'");
    System.out.println(
        "   Result: '" + Subject.capitalizeWords("introduction to programming") + "'");
    System.out.println();

    System.out.println("6. isIntroCourse() - contains 'intro':");
    System.out.println("   Result: " + subj1.isIntroCourse());
    System.out.println();

    System.out.println("7. syllabusLine():");
    System.out.println("   " + subj1.syllabusLine(inst));
    System.out.println();

    // Test 3: Non-intro course
    Instructor inst2 =
        new Instructor("Sarah", "Johnson", "555-5678", "sarah@uni.edu", "EMP456", null);

    Subject subj2 = new Subject(201, "CS301", "Advanced Algorithms", inst2);

    System.out.println("8. Non-intro course test:");
    System.out.println("   isIntroCourse(): " + subj2.isIntroCourse());
    System.out.println("   " + subj2.syllabusLine(inst2));
    System.out.println();

    // Test 4: Course with INTRO- prefix
    Subject subj3 = new Subject(102, "INTRO-CS", "Computer Science Basics", inst);

    System.out.println("9. Course with INTRO- prefix:");
    System.out.println("   isIntroCourse(): " + subj3.isIntroCourse());

    System.out.println("\n=== Tests Complete ===");
  }
}
