import java.util.Arrays;

public class RemoveDuplicatesSorted {

  public static int remove(int[] values) {
    if (values.length == 0) return 0;
    int write = 1;
    for (int read = 1; read < values.length; read++) if (
      values[read] != values[read - 1]
    ) values[write++] = values[read];
    return write;
  }

  public static void main(String[] args) {
    int[] values = { 1, 1, 2, 2, 3 };
    int length = remove(values);
    System.out.println(Arrays.toString(Arrays.copyOf(values, length)));
  }
}
