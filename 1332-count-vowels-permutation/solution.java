class Solution {
    public int countVowelPermutation(int n) {
        double[][] dp = new double[n+1][5];
        Arrays.fill(dp[1],1);
        for(int i=2;i<=n;i++){
            dp[i][0]=(dp[i-1][1]+dp[i-1][2]+dp[i-1][4]) % (1e9 + 7);
            dp[i][1]=(dp[i-1][0]+dp[i-1][2]) % (1e9 + 7);
            dp[i][2]=(dp[i-1][1]+dp[i-1][3]) % (1e9 + 7);
            dp[i][3]=(dp[i-1][2]) % (1e9 + 7);
            dp[i][4]=(dp[i-1][2]+dp[i-1][3]) % (1e9 + 7);
        }
        return (int)((dp[n][0]+dp[n][1]+dp[n][2]+dp[n][3]+dp[n][4]) % (1e9 + 7));
    }
}
