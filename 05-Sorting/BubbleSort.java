import java.util.Arrays;

public class BubbleSort {

  public static void sort(int[] values) {
    for (int end = values.length - 1; end > 0; end--) {
      boolean changed = false;
      for (int index = 0; index < end; index++) if (
        values[index] > values[index + 1]
      ) {
        int temp = values[index];
        values[index] = values[index + 1];
        values[index + 1] = temp;
        changed = true;
      }
      if (!changed) break;
    }
  }

  public static void main(String[] args) {
    int[] values = { 5, 2, 8, 1 };
    sort(values);
    System.out.println(Arrays.toString(values));
  }
}
