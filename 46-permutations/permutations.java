class Solution {
    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>>list=new ArrayList<>();
        boolean[]arr=new boolean[nums.length];

        List<Integer>list1=new ArrayList<>();

        back(nums,arr,list1,list);
        return list;
    }
    public static void back(int[]nums,boolean[]arr,List<Integer>list1,List<List<Integer>>list)
    {
        if(list1.size()==nums.length)
        {

            list.add(new ArrayList<>(list1));
            return ;
        } 
    for(int i=0;i<nums.length;i++)
    {
        if(arr[i]) continue;
        arr[i]=true;
        list1.add(nums[i]);
        back(nums,arr,list1,list);

        arr[i]=false;
        list1.remove(list1.size()-1);

 }
    }
}