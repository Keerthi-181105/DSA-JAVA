public class CountEvenOdd {

  public static int[] count(int[] values) {
    int even = 0;
    for (int value : values) if (value % 2 == 0) even++;
    return new int[] { even, values.length - even };
  }

  public static void main(String[] args) {
    int[] result = count(new int[] { 1, 2, 3, 4, 6 });
    System.out.println("Even=" + result[0] + ", Odd=" + result[1]);
  }
}
