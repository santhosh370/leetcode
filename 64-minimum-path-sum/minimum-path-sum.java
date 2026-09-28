class Solution {
    private int[][] dp;
    public int minPathSum(int[][] grid) {
        
        int p=grid.length;
        int q=grid[0].length;
        dp=new int[p][q];
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                dp[i][j]=-1;
            }
        }
        return dfs(0,0,grid);
    }

    public int dfs(int r, int c, int[][] grid){
        if(r==grid.length-1 && c==grid[0].length-1){
            return grid[r][c];
        }
        if(r==grid.length || c==grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        dp[r][c]=grid[r][c]+Math.min(dfs(r+1,c,grid),dfs(r,c+1,grid));
        return dp[r][c];
    }
}