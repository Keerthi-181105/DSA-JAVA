import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

  public static int find(int[] values) {
    Set<Integer> numbers = new HashSet<>();
    for (int value : values) numbers.add(value);
    int longest = 0;
    for (int value : numbers)
      if (!numbers.contains(value - 1)) {
        int current = value;
        while (numbers.contains(current)) current++;
        longest = Math.max(longest, current - value);
      }
    return longest;
  }

  public static void main(String[] args) {
    System.out.println(find(new int[] { 100, 4, 200, 1, 3, 2 }));
  }
}
