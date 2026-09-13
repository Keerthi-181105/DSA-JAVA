public class NonRepeatingElement {

  public static int find(int[] values) {
    int result = 0;
    for (int value : values) result ^= value;
    return result;
  }

  public static void main(String[] args) {
    System.out.println(find(new int[] { 4, 1, 2, 1, 2 }));
  }
}
