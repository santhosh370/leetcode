class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        long sum=0;
        long san=0;
        
        for (int i=0;i<n;i++) {
            sum+=nums[i];
            san +=(long)i*nums[i];
        }
        
        long max=san;
        
        for (int k=1;k<n;k++) {
            san =san+sum-(long)n*nums[n - k];
            max=Math.max(max,san);
        }
        
        return (int) max;
    }
}