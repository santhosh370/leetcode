class Solution {
    public int[] fairCandySwap(int[] nums, int[] arr) {
        int sumA=0,sumB=0;
        int n=nums.length;
        int m=arr.length;
        for(int i=0;i<n;i++)
        {
            sumA+=nums[i];
        }
        for(int i=0;i<m;i++)
        {
            sumB+=arr[i];
        }

        int mid=(sumA-sumB)/2;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums[i]-arr[j]==mid)
                {
                    return new int[]{nums[i],arr[j]};
                }
            }
        }
         return new int[]{};
        
    }
}