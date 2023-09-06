class Solution {
    public int maxProfit(int[] prices) {
        int highest = 0;
        int lowest = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < lowest) {
                lowest = prices[i];
            }
            profit = prices[i] - lowest;
            if(profit > highest) {
                highest = profit;
            }
            profit = highest - lowest;
        }
        return highest;
    }
}