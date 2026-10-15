class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }

        int ans=Math.abs(max-min)-2*k;
        if(ans<0)
        {
            ans=0;
        }
        return ans;
    }
}