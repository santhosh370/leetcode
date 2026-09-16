class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();

        boolean[]arr=new boolean[nums.length];
        Arrays.sort(nums);
        List<Integer>list1=new ArrayList<>();

        back(nums,arr,list,list1);
        return list;
    }
    public static void back(int[]nums,boolean[]arr,List<List<Integer>>list,List<Integer>list1)
    {
        if(list1.size()==nums.length)
        {

            list.add(new ArrayList<>(list1));
            return;
        } 
    for(int i=0;i<nums.length;i++)
    {
        if(arr[i]) continue;

        if(i>0 && nums[i]==nums[i-1] && !arr[i-1])
        {
            continue;
        } 
        arr[i]=true;
        list1.add(nums[i]);
        back(nums,arr,list,list1);

        arr[i]=false;
        list1.remove(list1.size()-1);

    }

    }
}