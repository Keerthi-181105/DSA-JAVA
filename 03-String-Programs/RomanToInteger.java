import java.util.Map;

public class RomanToInteger {

  private static final Map<Character, Integer> VALUES = Map.of(
    'I',
    1,
    'V',
    5,
    'X',
    10,
    'L',
    50,
    'C',
    100,
    'D',
    500,
    'M',
    1000
  );

  public static int convert(String roman) {
    int total = 0;
    for (int index = 0; index < roman.length(); index++) {
      int value = VALUES.get(roman.charAt(index));
      total +=
        index + 1 < roman.length() &&
        value < VALUES.get(roman.charAt(index + 1))
          ? -value
          : value;
    }
    return total;
  }

  public static void main(String[] args) {
    System.out.println(convert("MCMXCIV"));
  }
}
