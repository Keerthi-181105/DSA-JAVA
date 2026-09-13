import java.util.Arrays;

public class QuickSort {

  public static void sort(int[] values) {
    sort(values, 0, values.length - 1);
  }

  private static void sort(int[] values, int low, int high) {
    if (low >= high) return;
    int pivot = values[high],
      boundary = low;
    for (int index = low; index < high; index++) if (values[index] <= pivot) {
      int temp = values[index];
      values[index] = values[boundary];
      values[boundary++] = temp;
    }
    int temp = values[boundary];
    values[boundary] = values[high];
    values[high] = temp;
    sort(values, low, boundary - 1);
    sort(values, boundary + 1, high);
  }

  public static void main(String[] args) {
    int[] values = { 5, 2, 8, 1 };
    sort(values);
    System.out.println(Arrays.toString(values));
  }
}
