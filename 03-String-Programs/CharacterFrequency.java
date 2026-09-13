import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {

  public static Map<Character, Integer> count(String text) {
    Map<Character, Integer> result = new LinkedHashMap<>();
    for (char character : text.toCharArray())
      result.put(character, result.getOrDefault(character, 0) + 1);
    return result;
  }

  public static void main(String[] args) {
    System.out.println(count("banana"));
  }
}
