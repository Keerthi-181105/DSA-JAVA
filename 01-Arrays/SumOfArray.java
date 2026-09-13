public class SumOfArray {

  public static int sum(int[] values) {
    int total = 0;
    for (int value : values) total += value;
    return total;
  }

  public static void main(String[] args) {
    System.out.println(sum(new int[] { 1, 2, 3, 4, 5 }));
  }
}
