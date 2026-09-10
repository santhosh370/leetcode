class Solution {
     
    public List<List<Integer>> combinationSum(int[] nums, int target) 
    {

    List<List<Integer>>list1=new ArrayList<>();
    List<Integer>list=new ArrayList<>();
    back(nums,target,list1,list,0);
    return list1;
    
    }

    public static void back(int[]nums,int target,List<List<Integer>>list1,List<Integer>list,int start)
    {
        if(target==0)
        {
            list1.add(new ArrayList<>(list));
            return;
        }

        if(target<0)
        {
            return;
        }

        for(int i=start;i<nums.length;i++)
        {
            list.add(nums[i]);
            back(nums,target-nums[i],list1,list,i);
            list.remove(list.size()-1);
        }
    }
}