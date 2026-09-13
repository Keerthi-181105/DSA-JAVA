import java.util.Arrays;

public class ProductOfArray {

  public static long[] productExceptSelf(int[] values) {
    long[] result = new long[values.length];
    long prefix = 1,
      suffix = 1;
    for (int index = 0; index < values.length; index++) {
      result[index] = prefix;
      prefix *= values[index];
    }
    for (int index = values.length - 1; index >= 0; index--) {
      result[index] *= suffix;
      suffix *= values[index];
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(
      Arrays.toString(productExceptSelf(new int[] { 1, 2, 3, 4 }))
    );
  }
}
