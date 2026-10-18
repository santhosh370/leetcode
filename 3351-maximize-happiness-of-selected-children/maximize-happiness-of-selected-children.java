class Solution {
    public long maximumHappinessSum(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        long res = 0;
        for(int i=nums.length-1;i>=nums.length-k;i--){
            if(nums[i] + count > 0){
                res+=(long)(nums[i] + count);
            }
            count--;
        }

        return res;
    }
}