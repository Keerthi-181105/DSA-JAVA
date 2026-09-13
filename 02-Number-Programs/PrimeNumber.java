public class PrimeNumber {

  public static boolean isPrime(int number) {
    if (number < 2) return false;
    for (int divisor = 2; divisor * divisor <= number; divisor++) if (
      number % divisor == 0
    ) return false;
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPrime(29));
  }
}
