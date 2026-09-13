public class StringLength {

  public static int length(String text) {
    int count = 0;
    for (char ignored : text.toCharArray()) count++;
    return count;
  }

  public static void main(String[] args) {
    System.out.println(length("Java"));
  }
}
