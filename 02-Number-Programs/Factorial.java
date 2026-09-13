public class Factorial {

  public static long calculate(int number) {
    if (number < 0) throw new IllegalArgumentException(
      "Number cannot be negative"
    );
    long result = 1;
    for (int value = 2; value <= number; value++) result *= value;
    return result;
  }

  public static void main(String[] args) {
    System.out.println(calculate(5));
  }
}
