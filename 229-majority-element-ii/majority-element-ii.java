class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int n=nums.length;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i<n-1 && nums[i]==nums[i+1])
            {
                count++;
            }
            else
            {
                if(count>n/3)
                {
                    list.add(nums[i]);
                }
               count=1;
            }
            
        }
        return list;
    }
}