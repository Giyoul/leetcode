class Solution {
    public int maxProfit(int[] prices) {
        int bought = prices[0];
        int profit = 0;

        for(int price : prices) {
            if(bought > price) {
                bought = price;
            } else if(price - bought > profit) {
                profit = price - bought;
            }
        }

        return profit;
    }
}