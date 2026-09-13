public class ProductOfDigits {

  public static int product(int number) {
    number = Math.abs(number);
    if (number == 0) return 0;
    int result = 1;
    while (number > 0) {
      result *= number % 10;
      number /= 10;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(product(234));
  }
}
