public class MissingNumber {

  public static int find(int[] values) {
    int result = values.length;
    for (int index = 0; index < values.length; index++) result ^=
      index ^ values[index];
    return result;
  }

  public static void main(String[] args) {
    System.out.println(find(new int[] { 3, 0, 1 }));
  }
}
