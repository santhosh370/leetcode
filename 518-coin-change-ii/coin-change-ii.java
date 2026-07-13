class Solution {
    public int change(int amount, int[] coins) {
        int[]dp=new int[amount+1];

        dp[0]=1;

        for(int count:coins)
        {
            for(int i=count;i<=amount;i++)
            {
                dp[i]=dp[i]+dp[i-count];
            }
        }
        return dp[amount];
    }
}