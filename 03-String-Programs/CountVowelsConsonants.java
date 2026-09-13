public class CountVowelsConsonants {

  public static int[] count(String text) {
    int vowels = 0,
      consonants = 0;
    for (char character : text.toLowerCase().toCharArray())
      if (character >= 'a' && character <= 'z') {
        if ("aeiou".indexOf(character) >= 0) vowels++;
        else consonants++;
      }
    return new int[] { vowels, consonants };
  }

  public static void main(String[] args) {
    int[] result = count("Hello Java");
    System.out.println("Vowels=" + result[0] + ", Consonants=" + result[1]);
  }
}
