class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len=nums.length;
        int[]arr=new int[len];
        for(int i=0;i<len;i++)
        {
            if(i%2==0)
            {
                arr[i]=nums[i/2];
            }
            else
            {
                arr[i]=nums[n+(i/2)];
            }
        }
        return arr;
    }
}