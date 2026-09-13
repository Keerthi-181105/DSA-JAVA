public class ReverseWords {

  public static String reverse(String text) {
    String[] words = text.trim().split("\\s+");
    StringBuilder result = new StringBuilder();
    for (int index = words.length - 1; index >= 0; index--) {
      result.append(words[index]);
      if (index > 0) result.append(' ');
    }
    return result.toString();
  }

  public static void main(String[] args) {
    System.out.println(reverse("Java is fun"));
  }
}
