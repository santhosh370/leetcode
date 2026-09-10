class Solution {
    public int numIslands(char[][] nums) {
        int n=nums.length;
        int m=nums[0].length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums[i][j]=='1')
                {
                    count++;
                    dfs(nums,i,j);
                }
            }
        }
        return count;
    }
    public static void dfs(char[][]nums,int i,int j)
    {
        if(i<0 || j<0 || i>=nums.length || j>=nums[0].length || nums[i][j]=='0')
        {
            return;
        }
        nums[i][j]='0';
        dfs(nums,i+1,j);
        dfs(nums,i-1,j);
        dfs(nums,i,j+1);
        dfs(nums,i,j-1);
    }
}