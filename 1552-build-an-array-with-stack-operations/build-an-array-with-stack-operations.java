class Solution {
    public List<String> buildArray(int[] nums, int n) {
        List<String>list=new ArrayList<>();
        int j=0;
        for(int i=1;i<=n && j<nums.length; i++)
        {
            list.add("Push");
            if(nums[j]==i)
            {
                j++;
            }
            else
            {
                list.add("Pop");
            }
        }
        return list;
    }
}