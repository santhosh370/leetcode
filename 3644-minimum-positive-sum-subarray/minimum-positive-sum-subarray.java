class Solution {
    public int minimumSumSubarray(List<Integer> list, int l, int r) {
        int n=list.size();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=list.get(j);
                int len=j-i+1;
                if(len>=l && len<= r&& sum>0){
                    ans=Math.min(ans,sum);
                }
            }
        }
        if(ans == Integer.MAX_VALUE)
        {
            return -1;
        }
        return ans;
    }
}