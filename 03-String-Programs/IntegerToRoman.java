public class IntegerToRoman {

  private static final int[] NUMBERS = {
    1000,
    900,
    500,
    400,
    100,
    90,
    50,
    40,
    10,
    9,
    5,
    4,
    1,
  };
  private static final String[] SYMBOLS = {
    "M",
    "CM",
    "D",
    "CD",
    "C",
    "XC",
    "L",
    "XL",
    "X",
    "IX",
    "V",
    "IV",
    "I",
  };

  public static String convert(int number) {
    if (number < 1 || number > 3999) throw new IllegalArgumentException(
      "Roman numerals support 1 to 3999"
    );
    StringBuilder result = new StringBuilder();
    for (int index = 0; index < NUMBERS.length; index++) while (
      number >= NUMBERS[index]
    ) {
      result.append(SYMBOLS[index]);
      number -= NUMBERS[index];
    }
    return result.toString();
  }

  public static void main(String[] args) {
    System.out.println(convert(1994));
  }
}
