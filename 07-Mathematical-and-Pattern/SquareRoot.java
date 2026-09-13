public class SquareRoot {

  public static int floor(int number) {
    if (number < 0) throw new IllegalArgumentException(
      "Number cannot be negative"
    );
    int left = 0,
      right = number,
      answer = 0;
    while (left <= right) {
      int middle = left + (right - left) / 2;
      if (middle <= number / Math.max(middle, 1)) {
        answer = middle;
        left = middle + 1;
      } else right = middle - 1;
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(floor(27));
  }
}
