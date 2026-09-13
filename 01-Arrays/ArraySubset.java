import java.util.HashMap;
import java.util.Map;

public class ArraySubset {

  public static boolean isSubset(int[] first, int[] second) {
    Map<Integer, Integer> counts = new HashMap<>();
    for (int value : first)
      counts.put(value, counts.getOrDefault(value, 0) + 1);
    for (int value : second) {
      int count = counts.getOrDefault(value, 0);
      if (count == 0) return false;
      counts.put(value, count - 1);
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isSubset(new int[] { 1, 2, 3, 4 }, new int[] { 2, 4 }));
  }
}
