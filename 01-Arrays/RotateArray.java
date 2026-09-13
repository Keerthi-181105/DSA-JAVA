import java.util.Arrays;

public class RotateArray {

  public static void rotateRight(int[] values, int steps) {
    if (values.length == 0) return;
    steps = ((steps % values.length) + values.length) % values.length;
    reverse(values, 0, values.length - 1);
    reverse(values, 0, steps - 1);
    reverse(values, steps, values.length - 1);
  }

  private static void reverse(int[] values, int left, int right) {
    while (left < right) {
      int temp = values[left];
      values[left++] = values[right];
      values[right--] = temp;
    }
  }

  public static void main(String[] args) {
    int[] values = { 1, 2, 3, 4, 5 };
    rotateRight(values, 2);
    System.out.println(Arrays.toString(values));
  }
}
