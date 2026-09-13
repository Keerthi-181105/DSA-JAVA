public class EquilibriumIndex {

  public static int find(int[] values) {
    long total = 0,
      left = 0;
    for (int value : values) total += value;
    for (int index = 0; index < values.length; index++) {
      if (left == total - left - values[index]) return index;
      left += values[index];
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(find(new int[] { -7, 1, 5, 2, -4, 3, 0 }));
  }
}
