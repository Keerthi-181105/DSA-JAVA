import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static int[] find(int[] values, int target) {
    Map<Integer, Integer> seen = new HashMap<>();
    for (int index = 0; index < values.length; index++) {
      int complement = target - values[index];
      if (seen.containsKey(complement)) return new int[] {
        seen.get(complement),
        index,
      };
      seen.put(values[index], index);
    }
    return new int[0];
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(find(new int[] { 2, 7, 11, 15 }, 9)));
  }
}
