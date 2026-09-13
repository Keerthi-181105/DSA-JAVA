public class RemoveVowels {

  public static String remove(String text) {
    return text.replaceAll("(?i)[aeiou]", "");
  }

  public static void main(String[] args) {
    System.out.println(remove("Hello World"));
  }
}
