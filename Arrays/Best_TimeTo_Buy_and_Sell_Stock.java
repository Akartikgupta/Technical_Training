// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Best_TimeTo_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int lowPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowPrice) {
                lowPrice = prices[i];
            }
            int profit = prices[i] - lowPrice;
            // if (profit > maxProfit) {
            // maxProfit = profit;
            // }
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(arr));
    }
}
