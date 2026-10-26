class Solution {
    public int countIslands(int[][] nums, int k) {
        int n=nums.length;
        int m=nums[0].length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums[i][j]>0)
                {
                    long san=dfs(nums,i,j);
                    if(san%k==0)
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public long dfs(int[][]nums,int i, int j)
    {
        int n=nums.length;
        int m=nums[0].length;
        if(i<0 || j<0 || i>=n || j>=m || nums[i][j]==0)
        {
            return 0;
        }
        long sum=nums[i][j];
        nums[i][j] = 0;
        sum += dfs(nums, i + 1, j);
        sum += dfs(nums, i - 1, j);
        sum += dfs(nums, i, j + 1);
        sum += dfs(nums, i, j - 1);

        return sum;
    }
}