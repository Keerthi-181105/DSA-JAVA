public class RemoveSpaces {

  public static String remove(String text) {
    return text.replaceAll("\\s+", "");
  }

  public static void main(String[] args) {
    System.out.println(remove("Java coding practice"));
  }
}
