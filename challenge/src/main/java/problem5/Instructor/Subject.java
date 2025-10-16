package problem5.Instructor;

public class Subject {
  private int id;
  private String code;
  private String title;
  private Instructor instructor;

  public Subject(int id, String code, String title, Instructor instructor) {
    this.id = id;
    this.title = title;
    this.code = code;
    this.instructor = instructor;
  }

  public String normalizedCode() {
    return this.code.trim().toUpperCase();
  }

  public static String capitalizeWords(String input) {
    if (input == null || input.isEmpty()) return input;

    String[] words = input.split("\\s+");
    StringBuilder sb = new StringBuilder();

    for (String word : words) {
      if (word.length() > 0) {
        sb.append(Character.toUpperCase(word.charAt(0)))
            .append(word.substring(1).toLowerCase())
            .append(" ");
      }
    }

    return sb.toString().trim();
  }

  public boolean isIntroCourse() {
    if (this.title.toUpperCase().contains("INTRO") || this.code.startsWith("INTRO-")) {
      return true;
    }
    return false;
  }

  public String syllabusLine(Instructor inst) {
    StringBuilder sb = new StringBuilder();
    sb.append(
        String.format(
            "%s - %s ( Instructor : %s %s)",
            this.normalizedCode(),
            this.capitalizeWords(this.title),
            inst.getSecondName(),
            inst.getFirstName()));
    return sb.toString();
  }
}
