public class RotateString {

  public static String rotateLeft(String text, int places) {
    if (text.isEmpty()) return text;
    places = ((places % text.length()) + text.length()) % text.length();
    return text.substring(places) + text.substring(0, places);
  }

  public static void main(String[] args) {
    System.out.println(rotateLeft("abcdef", 2));
  }
}
