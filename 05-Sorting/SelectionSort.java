import java.util.Arrays;

public class SelectionSort {

  public static void sort(int[] values) {
    for (int start = 0; start < values.length - 1; start++) {
      int smallest = start;
      for (int index = start + 1; index < values.length; index++) if (
        values[index] < values[smallest]
      ) smallest = index;
      int temp = values[start];
      values[start] = values[smallest];
      values[smallest] = temp;
    }
  }

  public static void main(String[] args) {
    int[] values = { 5, 2, 8, 1 };
    sort(values);
    System.out.println(Arrays.toString(values));
  }
}
