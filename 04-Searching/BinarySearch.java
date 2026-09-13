public class BinarySearch {

  public static int find(int[] values, int target) {
    int left = 0,
      right = values.length - 1;
    while (left <= right) {
      int middle = left + (right - left) / 2;
      if (values[middle] == target) return middle;
      if (values[middle] < target) left = middle + 1;
      else right = middle - 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(find(new int[] { 1, 3, 5, 7, 9 }, 7));
  }
}
