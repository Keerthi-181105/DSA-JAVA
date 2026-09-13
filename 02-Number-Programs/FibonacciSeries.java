import java.util.Arrays;

public class FibonacciSeries {

  public static long[] generate(int count) {
    if (count < 0) throw new IllegalArgumentException(
      "Count cannot be negative"
    );
    long[] result = new long[count];
    if (count > 0) result[0] = 0;
    if (count > 1) result[1] = 1;
    for (int index = 2; index < count; index++) result[index] =
      result[index - 1] + result[index - 2];
    return result;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(generate(10)));
  }
}
