public class CountWords {

  public static int count(String text) {
    String trimmed = text.trim();
    return trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
  }

  public static void main(String[] args) {
    System.out.println(count("Java coding practice"));
  }
}
