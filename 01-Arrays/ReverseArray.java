import java.util.Arrays;

public class ReverseArray {

  public static void reverse(int[] values) {
    for (
      int left = 0, right = values.length - 1;
      left < right;
      left++, right--
    ) {
      int temporary = values[left];
      values[left] = values[right];
      values[right] = temporary;
    }
  }

  public static void main(String[] args) {
    int[] values = { 1, 2, 3, 4 };
    reverse(values);
    System.out.println(Arrays.toString(values));
  }
}
