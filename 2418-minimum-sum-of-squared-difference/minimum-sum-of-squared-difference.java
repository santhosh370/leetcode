class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[]arr=new int[100001];
        long k=(long) k1+k2;
        long sum=0;
        int max=0;
        int n=nums1.length;
        for(int i=0;i<n;i++)
        {
            int diff=Math.abs(nums1[i]-nums2[i]);
            arr[diff]++;
            sum+=diff;
            max=Math.max(max,diff);
        }

        if(sum<=k)
        {
            return 0;
        }

        for(int i=max;i>0 && k>0;i--)
        {
            long move=Math.min(k,arr[i]);
            arr[i]-=(int) move;
            arr[i-1]+=(int) move;
            k-=(int)move;
        }

        long ans=0;
        for(int i=0;i<=max;i++)
        {
            ans+=(long) i*i*arr[i];
        }
        return ans;
    }
}