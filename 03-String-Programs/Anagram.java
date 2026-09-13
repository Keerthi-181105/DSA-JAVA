import java.util.Arrays;

public class Anagram {

  public static boolean areAnagrams(String first, String second) {
    char[] a = first.replaceAll("\\s", "").toLowerCase().toCharArray();
    char[] b = second.replaceAll("\\s", "").toLowerCase().toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    return Arrays.equals(a, b);
  }

  public static void main(String[] args) {
    System.out.println(areAnagrams("listen", "silent"));
  }
}
