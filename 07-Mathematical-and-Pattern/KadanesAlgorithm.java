public class KadanesAlgorithm {

  public static int maximumSum(int[] values) {
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
    System.out.println(maximumSum(new int[] { -2, 3, 2, -1 }));
  }
}
