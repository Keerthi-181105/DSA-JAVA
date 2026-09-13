import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

  public static char find(String text) {
    Map<Character, Integer> counts = new LinkedHashMap<>();
    for (char character : text.toCharArray())
      counts.put(character, counts.getOrDefault(character, 0) + 1);
    for (char character : text.toCharArray())
      if (counts.get(character) == 1) return character;
    return '\0';
  }

  public static void main(String[] args) {
    System.out.println(find("swiss"));
  }
}
