public class PalindromeNumber {

  public static boolean isPalindrome(int number) {
    if (number < 0 || (number % 10 == 0 && number != 0)) return false;
    int reversedHalf = 0;
    while (number > reversedHalf) {
      reversedHalf = reversedHalf * 10 + (number % 10);
      number /= 10;
    }
    return number == reversedHalf || number == reversedHalf / 10;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(1221));
  }
}
