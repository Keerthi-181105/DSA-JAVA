public class PerfectNumber {

  public static boolean isPerfect(int number) {
    if (number <= 1) return false;
    int sum = 1;
    for (int divisor = 2; divisor * divisor <= number; divisor++) if (
      number % divisor == 0
    ) {
      sum += divisor;
      if (divisor * divisor != number) sum += number / divisor;
    }
    return sum == number;
  }

  public static void main(String[] args) {
    System.out.println(isPerfect(28));
  }
}
