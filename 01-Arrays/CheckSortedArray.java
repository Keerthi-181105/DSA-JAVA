public class CheckSortedArray {

  public static boolean isSorted(int[] values) {
    for (int index = 1; index < values.length; index++) {
      if (values[index] < values[index - 1]) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isSorted(new int[] { 1, 2, 2, 5 }));
  }
}
