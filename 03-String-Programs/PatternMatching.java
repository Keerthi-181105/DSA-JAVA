public class PatternMatching {

  public static int find(String text, String pattern) {
    if (pattern.isEmpty()) return 0;
    for (int start = 0; start <= text.length() - pattern.length(); start++) {
      int index = 0;
      while (
          index < pattern.length() &&
          text.charAt(start + index) == pattern.charAt(index)
        )
        index++;
      if (index == pattern.length()) return start;
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(find("hello world", "world"));
  }
}
