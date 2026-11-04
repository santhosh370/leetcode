class Solution {
    class MultiSet {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int size=0;
        long sum=0;
        void add(int val) {
            map.put(val,map.getOrDefault(val,0)+1);
            size++;
            sum+=val;
        }
        void remove(int val) {
            int count=map.get(val);
            if(count==1)map.remove(val);
            else map.put(val,count-1);
            size--;
            sum-=val;
        }
        int first() {
            return map.firstKey();
        }
        int last() {
            return map.lastKey();
        }
    }
    MultiSet left=new MultiSet();
    MultiSet right=new MultiSet();
    void balance() {
        while(left.size>right.size+1) {
            int val=left.last();
            left.remove(val);
            right.add(val);
        }
        while(left.size<right.size) {
            int val=right.first();
            right.remove(val);
            left.add(val);
        }
    }
    void add(int val) {
        if(left.size==0||val<=left.last())left.add(val);
        else right.add(val);
        balance();
    }
    void remove(int val) {
        if(left.map.containsKey(val))left.remove(val);
        else right.remove(val);
        balance();
    }
    long cost() {
        long median=left.last();
        return median*left.size-left.sum+right.sum-median*right.size;
    }
    public long minOperations(int[] nums,int x,int k) {
        int n=nums.length;
        long[] costs=new long[n-x+1];
        for(int i=0;i<x;i++)add(nums[i]);
        costs[0]=cost();
        for(int i=x;i<n;i++) {
            remove(nums[i-x]);
            add(nums[i]);
            costs[i-x+1]=cost();
        }
        long INF=Long.MAX_VALUE/4;
        long[][] dp=new long[n+1][k+1];
        for(int i=0;i<=n;i++)Arrays.fill(dp[i],INF);
        dp[0][0]=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<=k;j++) {
                if(dp[i][j]==INF)continue;
                dp[i+1][j]=Math.min(dp[i+1][j],dp[i][j]);
                if(j<k&&i+x<=n) {
                    dp[i+x][j+1]=Math.min(dp[i+x][j+1],dp[i][j]+costs[i]);
                }
            }
        }
        long ans=INF;
        for(int i=0;i<=n;i++)ans=Math.min(ans,dp[i][k]);
        return ans;
    }
}