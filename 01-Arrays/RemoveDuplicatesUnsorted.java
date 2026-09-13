import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesUnsorted {

  public static int[] remove(int[] values) {
    return new LinkedHashSet<Integer>() {
      {
        for (int value : values) add(value);
      }
    }
      .stream()
      .mapToInt(Integer::intValue)
      .toArray();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(remove(new int[] { 3, 1, 3, 2, 1 })));
  }
}
