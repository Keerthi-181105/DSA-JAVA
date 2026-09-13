import java.util.Arrays;

public class InsertionSort {

  public static void sort(int[] values) {
    for (int index = 1; index < values.length; index++) {
      int value = values[index],
        position = index - 1;
      while (position >= 0 && values[position] > value)
        values[position + 1] = values[position--];
      values[position + 1] = value;
    }
  }

  public static void main(String[] args) {
    int[] values = { 5, 2, 4, 1 };
    sort(values);
    System.out.println(Arrays.toString(values));
  }
}
