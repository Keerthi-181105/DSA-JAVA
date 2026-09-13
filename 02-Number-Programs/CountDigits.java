public class CountDigits {

  public static int count(int number) {
    if (number == 0) return 1;
    int count = 0;
    number = Math.abs(number);
    while (number > 0) {
      count++;
      number /= 10;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(count(-12050));
  }
}
