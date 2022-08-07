public class BestTimeToBuyAndSellStock{
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minPriceSoFar = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPriceSoFar){
                minPriceSoFar = prices[i];
            }
            if (prices[i] - minPriceSoFar > maxProfit){
                maxProfit = prices[i] - minPriceSoFar;
            }
        }
        return maxProfit;
    }
}
