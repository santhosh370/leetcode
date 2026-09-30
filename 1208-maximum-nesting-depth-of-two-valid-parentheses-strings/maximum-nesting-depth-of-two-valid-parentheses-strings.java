class Solution {
    public int[] maxDepthAfterSplit(String s1) {
        int n=s1.length();
        int[]arr=new int[n];
        int count=0;

        for(int i=0;i<n;i++)
        {
            char ch=s1.charAt(i);

            if(ch=='(')
            {
                count++;
                arr[i]=count%2;
            }
            else
            {
                arr[i]=count%2;
                count--;
            }
        }
        return arr;

    }
}