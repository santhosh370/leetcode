class Solution {
    public long countCommas(long n) {
        long cur=1000;
        long ans=0;

        while(cur<=n)
        {
            ans+=n-cur+1;
            cur*=1000;
        }
        return ans;
    }
}