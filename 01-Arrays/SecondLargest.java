public class SecondLargest {

  public static int find(int[] values) {
    if (values.length < 2) throw new IllegalArgumentException(
      "At least two values are required"
    );
    Integer largest = null,
      second = null;
    for (int value : values) {
      if (largest == null || value > largest) {
        second = largest;
        largest = value;
      } else if (value != largest && (second == null || value > second)) {
        second = value;
      }
    }
    if (second == null) throw new IllegalArgumentException(
      "No distinct second largest value"
    );
    return second;
  }

  public static void main(String[] args) {
    System.out.println(find(new int[] { 10, 4, 8, 10, 6 }));
  }
}
