import java.util.Arrays;

public class MergeSort {

  public static void sort(int[] values) {
    if (values.length < 2) return;
    int middle = values.length / 2;
    int[] left = Arrays.copyOfRange(values, 0, middle),
      right = Arrays.copyOfRange(values, middle, values.length);
    sort(left);
    sort(right);
    int i = 0,
      j = 0,
      write = 0;
    while (i < left.length && j < right.length)
      values[write++] = left[i] <= right[j] ? left[i++] : right[j++];
    while (i < left.length) values[write++] = left[i++];
    while (j < right.length) values[write++] = right[j++];
  }

  public static void main(String[] args) {
    int[] values = { 5, 2, 8, 1 };
    sort(values);
    System.out.println(Arrays.toString(values));
  }
}
