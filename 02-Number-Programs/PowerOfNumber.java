public class PowerOfNumber {

  public static long power(long base, int exponent) {
    if (exponent < 0) throw new IllegalArgumentException(
      "Exponent cannot be negative"
    );
    long result = 1;
    while (exponent > 0) {
      if ((exponent & 1) == 1) result *= base;
      base *= base;
      exponent >>= 1;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(power(2, 10));
  }
}
