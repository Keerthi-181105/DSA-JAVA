import java.util.Arrays;

public class PrefixSumArray {

  public static int[] build(int[] values) {
    int[] prefix = new int[values.length];
    for (int index = 0; index < values.length; index++) prefix[index] =
      values[index] + (index == 0 ? 0 : prefix[index - 1]);
    return prefix;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(build(new int[] { 1, 2, 3, 4 })));
  }
}
