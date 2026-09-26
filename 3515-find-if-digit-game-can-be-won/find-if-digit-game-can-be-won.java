class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum=0;
        int doubleDigitSum=0;
        //int total=0;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            //int total+=num;
            if(num<10)
            {
                singleDigitSum+=num;
            }
            else
            {
                doubleDigitSum+=num;
            }
        }
        return singleDigitSum != doubleDigitSum;
    }
}