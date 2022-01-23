public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int index = 0; index < prices.length; index++) {
            if (prices[index] < minPrice) {
                minPrice = prices[index];
            } else if (prices[index] - minPrice > maxProfit) {
                maxProfit = prices[index] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
