class Solution {
    public int maxChunksToSorted(int[] arr) {
        int sumofrun=0;
        int sumofexpected=0;
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            sumofrun+=arr[i];
            sumofexpected+=i;

            if(sumofrun ==   sumofexpected)
            {
                count++;
            }
        }
        return count;
    }
}