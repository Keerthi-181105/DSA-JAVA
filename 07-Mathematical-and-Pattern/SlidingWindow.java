public class SlidingWindow {

  public static int maximumSum(int[] values, int windowSize) {
    if (
      windowSize < 1 || windowSize > values.length
    ) throw new IllegalArgumentException("Invalid window size");
    int sum = 0;
    for (int index = 0; index < windowSize; index++) sum += values[index];
    int best = sum;
    for (int index = windowSize; index < values.length; index++) {
      sum += values[index] - values[index - windowSize];
      best = Math.max(best, sum);
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(maximumSum(new int[] { 2, 1, 5, 1, 3, 2 }, 3));
  }
}
