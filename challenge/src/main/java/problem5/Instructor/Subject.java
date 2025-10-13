package instructor;

public class Subject extends Instructor {
  private int id;
  private String code;
  private String title;

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
}
