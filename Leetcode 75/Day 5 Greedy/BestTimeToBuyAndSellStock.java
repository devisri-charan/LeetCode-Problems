public class BestTimeToBuyAndSellStock{
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minPrice_so_far = prices[0];
        int maxProfit_so_far = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice_so_far){
                minPrice_so_far = prices[i];
            }
            else if (prices[i] - minPrice_so_far > maxProfit_so_far){
                maxProfit_so_far = prices[i] - minPrice_so_far;
            }
        }
        return maxProfit_so_far;
    }
}