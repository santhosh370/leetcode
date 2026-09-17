class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int cur=target-nums[i];
            if(arr.containsKey(cur))
            {
                return new int[]{i,arr.get(cur)};
            }
            arr.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}