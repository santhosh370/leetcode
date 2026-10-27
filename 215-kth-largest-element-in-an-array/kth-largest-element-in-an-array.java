class Solution {
    public int findKthLargest(int[] nums, int k) {
       int[]arr=new int[20001];

       for(int num:nums)
       {
        arr[num+10000]++;
       } 
       int count=0;
       for(int i=20000;i>=0;i--)
       {
        count+=arr[i];

        if(count>=k)
        {
            return i-10000;
        }
       }
       return -1;
    }
}