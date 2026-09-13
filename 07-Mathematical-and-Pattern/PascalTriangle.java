import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

  public static List<List<Integer>> generate(int rows) {
    List<List<Integer>> result = new ArrayList<>();
    for (int row = 0; row < rows; row++) {
      List<Integer> current = new ArrayList<>();
      for (int index = 0; index <= row; index++) current.add(
        index == 0 || index == row
          ? 1
          : result.get(row - 1).get(index - 1) + result.get(row - 1).get(index)
      );
      result.add(current);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(generate(5));
  }
}
