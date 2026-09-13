import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfElements {

  public static Map<Integer, Integer> count(int[] values) {
    Map<Integer, Integer> frequencies = new LinkedHashMap<>();
    for (int value : values)
      frequencies.put(value, frequencies.getOrDefault(value, 0) + 1);
    return frequencies;
  }

  public static void main(String[] args) {
    System.out.println(count(new int[] { 2, 1, 2, 3, 1, 2 }));
  }
}
