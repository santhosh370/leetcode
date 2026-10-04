class Solution {
    public List<List<Integer>> findWinners(int[][] nums) {
        int n=nums.length;
        int[]arr=new int[1000001];
        boolean[]bool_arr=new boolean[1000001];

        for(int i=0;i<n;i++)
        {
            int win=nums[i][0];
            int loss=nums[i][1];

            bool_arr[win]=true;
            bool_arr[loss]=true;

            arr[loss]++;
        }

        List<Integer> zerolost=new ArrayList<>();
        List<Integer> onelost=new ArrayList<>();

        for(int i=1;i<=100000;i++)
        {
            if(!bool_arr[i])
            {
                continue;
            }
            if(arr[i]==0)
            {
                zerolost.add(i);
            }
            else if(arr[i]==1)
            {
                onelost.add(i);
            }
        }
        List<List<Integer>> list=new ArrayList<>();

        list.add(zerolost);
        list.add(onelost);

        return list;
    }
}