class Solution {
    public int maxProfit(int[] prices) {
      int profit = 0;
      int lPrice = prices[0];
      for(int i = 0; i< prices.length; i++){
          if(prices[i]< lPrice)
          lPrice = prices[i];
          int temp = prices[i] - lPrice;
          if(profit< temp){
              profit = temp;
          }
      }
      return(profit);
    }
}
