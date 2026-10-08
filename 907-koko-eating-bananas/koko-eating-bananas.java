class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int left=1;
        int right=0;

        for(int num:nums)
        {
            right=Math.max(right,num);
        }

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            long hours=0;

            for(int num:nums)
            {
                hours+=(num+mid-1)/mid;
            }

            if(hours<=h)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
    }
}