class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int n=matches.length;
        int[]arr=new int[1000001];
        boolean[]boolarr=new boolean[1000001];

        for(int i=0;i<n;i++)
        {
            int win=matches[i][0];
            int loss=matches[i][1];

            boolarr[win]=true;
            boolarr[loss]=true;

            arr[loss]++;
        }

        List<Integer> zerolost=new ArrayList<>();
        List<Integer> onelost=new ArrayList<>();

        for(int i=1;i<=100000;i++)
        {
            if(!boolarr[i])
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