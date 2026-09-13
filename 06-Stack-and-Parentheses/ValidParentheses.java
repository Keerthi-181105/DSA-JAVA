import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ValidParentheses {

  public static boolean isValid(String text) {
    Deque<Character> stack = new ArrayDeque<>();
    Map<Character, Character> pairs = Map.of(')', '(', ']', '[', '}', '{');
    for (char character : text.toCharArray()) {
      if (pairs.containsValue(character)) stack.push(character);
      else if (
        pairs.containsKey(character) &&
        (stack.isEmpty() || stack.pop() != pairs.get(character))
      ) return false;
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println(isValid("{[()]}"));
  }
}
