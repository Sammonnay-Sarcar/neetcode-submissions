class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<1){
            return 0;
        }
        int[] DP = new int [amount+1];
        for(int i =1; i<amount+1;i++){
            DP[i] = Integer.MAX_VALUE;
        }
        DP[0] = 0;
        for(int i = 1;i<=amount;i++){
            for(int coin: coins){
                if(coin<=i && (DP[i-coin] != Integer.MAX_VALUE )){
                    DP[i] = Math.min(DP[i], 1+DP[i-coin]);
                }
            }
        }
        return DP[amount]!=Integer.MAX_VALUE? DP[amount]:-1;
    }
}
