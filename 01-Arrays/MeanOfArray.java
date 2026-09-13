public class MeanOfArray {

  public static double mean(int[] values) {
    if (values.length == 0) throw new IllegalArgumentException(
      "Array cannot be empty"
    );
    int total = 0;
    for (int value : values) total += value;
    return (double) total / values.length;
  }

  public static void main(String[] args) {
    System.out.println(mean(new int[] { 2, 4, 6, 8 }));
  }
}
