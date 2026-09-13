public class ReverseString {

  public static String reverse(String text) {
    return new StringBuilder(text).reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(reverse("Java"));
  }
}
