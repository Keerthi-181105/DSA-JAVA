public class MaximumSubarraySum {

  public static int find(int[] values) {
    if (values.length == 0) throw new IllegalArgumentException(
      "Array cannot be empty"
    );
    int best = values[0],
      current = values[0];
    for (int index = 1; index < values.length; index++) {
      current = Math.max(values[index], current + values[index]);
      best = Math.max(best, current);
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(find(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
  }
}
