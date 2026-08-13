class Solution {
    public boolean isToeplitzMatrix(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(nums[i-1][j-1] != nums[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}