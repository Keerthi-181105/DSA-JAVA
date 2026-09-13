import java.util.Arrays;

public class KthLargestElement {

  public static int find(int[] values, int k) {
    if (k < 1 || k > values.length) throw new IllegalArgumentException(
      "Invalid k"
    );
    int[] copy = Arrays.copyOf(values, values.length);
    Arrays.sort(copy);
    return copy[copy.length - k];
  }

  public static void main(String[] args) {
    System.out.println(find(new int[] { 3, 2, 1, 5, 6, 4 }, 2));
  }
}
