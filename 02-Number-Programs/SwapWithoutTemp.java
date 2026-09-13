public class SwapWithoutTemp {

  public static int[] swap(int first, int second) {
    first ^= second;
    second ^= first;
    first ^= second;
    return new int[] { first, second };
  }

  public static void main(String[] args) {
    int[] result = swap(5, 9);
    System.out.println(result[0] + " " + result[1]);
  }
}
