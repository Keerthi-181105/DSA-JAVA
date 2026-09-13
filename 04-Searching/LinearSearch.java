public class LinearSearch {

  public static int find(int[] values, int target) {
    for (int index = 0; index < values.length; index++) if (
      values[index] == target
    ) return index;
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(find(new int[] { 4, 2, 7, 1 }, 7));
  }
}
