class Solution {
    public int minAddToMakeValid(String s1) {
        int n=s1.length();
        int open=0;
        int close=0;
        for(int i=0;i<n;i++)
        {
            char ch=s1.charAt(i);

            if(ch=='(')
            {
                open++;
            }

            else
            {
                if(open>0)
                {
                    open--;
                }
                else
            {
                close++;
            }
            }
            
        }
        return open+close;
    }
}