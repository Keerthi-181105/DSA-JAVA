public class StockBuySell {

  public static int maxProfit(int[] prices) {
    int minimum = Integer.MAX_VALUE,
      profit = 0;
    for (int price : prices) {
      minimum = Math.min(minimum, price);
      profit = Math.max(profit, price - minimum);
    }
    return profit;
  }

  public static void main(String[] args) {
    System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
  }
}
