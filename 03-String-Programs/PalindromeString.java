public class PalindromeString {

  public static boolean isPalindrome(String text) {
    String clean = text.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    return clean.equals(new StringBuilder(clean).reverse().toString());
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
  }
}
