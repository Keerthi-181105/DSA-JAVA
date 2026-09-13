public class ArmstrongNumber {

  public static boolean isArmstrong(int number) {
    if (number < 0) return false;
    int digits = number == 0 ? 1 : 0;
    for (int value = number; value > 0; value /= 10) digits++;
    int copy = number;
    long total = 0;
    do {
      int digit = copy % 10;
      total += power(digit, digits);
      copy /= 10;
    } while (copy > 0);
    return total == number;
  }

  private static long power(int base, int exponent) {
    long result = 1;
    for (int count = 0; count < exponent; count++) result *= base;
    return result;
  }

  public static void main(String[] args) {
    System.out.println(isArmstrong(153));
  }
}
