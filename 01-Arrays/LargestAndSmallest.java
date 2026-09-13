public class LargestAndSmallest {

  public static int[] find(int[] values) {
    if (values.length == 0) throw new IllegalArgumentException(
      "Array cannot be empty"
    );
    int smallest = values[0],
      largest = values[0];
    for (int value : values) {
      smallest = Math.min(smallest, value);
      largest = Math.max(largest, value);
    }
    return new int[] { largest, smallest };
  }

  public static void main(String[] args) {
    int[] result = find(new int[] { 7, 2, 9, 1, 5 });
    System.out.println("Largest=" + result[0] + ", Smallest=" + result[1]);
  }
}
