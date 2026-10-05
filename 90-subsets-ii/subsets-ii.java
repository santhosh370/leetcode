class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>list1=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        back(nums,0,list1,list);

        return list1;
    }
    public static void back(int[]nums,int start,List<List<Integer>>list1,List<Integer>list)
    {
        list1.add(new ArrayList<>(list));

        for(int i=start;i<nums.length;i++)
        {
            if(i>start && nums[i]==nums[i-1])
            {
                continue;
            }
        
        list.add(nums[i]);
        back(nums,i+1,list1,list);
        list.remove(list.size()-1);
    }
    }
    
}