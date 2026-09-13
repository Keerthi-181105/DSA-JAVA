public class ReverseNumber {

  public static int reverse(int number) {
    long result = 0;
    int sign = number < 0 ? -1 : 1;
    number = Math.abs(number);
    while (number > 0) {
      result = result * 10 + (number % 10);
      number /= 10;
    }
    result *= sign;
    if (
      result < Integer.MIN_VALUE || result > Integer.MAX_VALUE
    ) throw new ArithmeticException("Overflow");
    return (int) result;
  }

  public static void main(String[] args) {
    System.out.println(reverse(-1234));
  }
}
