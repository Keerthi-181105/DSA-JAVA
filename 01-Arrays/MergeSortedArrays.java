import java.util.Arrays;

public class MergeSortedArrays {

  public static int[] merge(int[] first, int[] second) {
    int[] result = new int[first.length + second.length];
    int i = 0,
      j = 0,
      write = 0;
    while (i < first.length && j < second.length)
      result[write++] = first[i] <= second[j] ? first[i++] : second[j++];
    while (i < first.length) result[write++] = first[i++];
    while (j < second.length) result[write++] = second[j++];
    return result;
  }

  public static void main(String[] args) {
    System.out.println(
      Arrays.toString(merge(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }))
    );
  }
}
