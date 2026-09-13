public class GCD {

  public static int find(int first, int second) {
    first = Math.abs(first);
    second = Math.abs(second);
    while (second != 0) {
      int temp = first % second;
      first = second;
      second = temp;
    }
    return first;
  }

  public static void main(String[] args) {
    System.out.println(find(48, 18));
  }
}
