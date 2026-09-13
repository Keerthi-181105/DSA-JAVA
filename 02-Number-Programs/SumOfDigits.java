public class SumOfDigits {

  public static int sum(int number) {
    number = Math.abs(number);
    int total = 0;
    while (number > 0) {
      total += number % 10;
      number /= 10;
    }
    return total;
  }

  public static void main(String[] args) {
    System.out.println(sum(12345));
  }
}
