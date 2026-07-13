class Solution {
    public int coinChange(int[] coins, int amount) {
        int[]dp=new int[amount+1];

        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for(int count:coins)
        {
            for(int i=count;i<=amount;i++)
            {
                dp[i]=Math.min(dp[i],dp[i-count]+1);
            }
        }
        if(dp[amount]<=amount)
        {
            return dp[amount];
        }

        return -1;
        
    }
}