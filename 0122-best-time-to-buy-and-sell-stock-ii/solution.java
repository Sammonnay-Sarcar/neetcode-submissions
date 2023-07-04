class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit= 0;
        int leastPrice = prices[0];
        for(int i = 0; i<prices.length; i++){
            leastPrice = Math.min(leastPrice, prices[i]);
            if(prices[i] - leastPrice >0){
                totalProfit += prices[i] - leastPrice;
                leastPrice = prices[i];
            }
        }
        return(totalProfit);
    }
}
