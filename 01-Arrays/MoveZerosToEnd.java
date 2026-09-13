import java.util.Arrays;

public class MoveZerosToEnd {

  public static void move(int[] values) {
    int write = 0;
    for (int value : values) if (value != 0) values[write++] = value;
    while (write < values.length) values[write++] = 0;
  }

  public static void main(String[] args) {
    int[] values = { 0, 1, 0, 3, 12 };
    move(values);
    System.out.println(Arrays.toString(values));
  }
}
