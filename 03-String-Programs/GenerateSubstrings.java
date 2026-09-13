import java.util.ArrayList;
import java.util.List;

public class GenerateSubstrings {

  public static List<String> generate(String text) {
    List<String> result = new ArrayList<>();
    for (int start = 0; start < text.length(); start++) for (
      int end = start + 1;
      end <= text.length();
      end++
    ) result.add(text.substring(start, end));
    return result;
  }

  public static void main(String[] args) {
    System.out.println(generate("abc"));
  }
}
