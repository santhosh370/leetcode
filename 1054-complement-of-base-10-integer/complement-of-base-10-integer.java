class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)
        {
            return 1;
        }
        int ans=1;
        while(ans<n)
        {
            ans=ans*2+1;
            

        }
        return n^ans;
    }
}