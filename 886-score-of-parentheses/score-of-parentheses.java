class Solution {
    public int scoreOfParentheses(String s1) {
        int san=0;
        int ans=0;
       
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='(')
            {
                san++;
            }
            else
            {
                san--;

                if(s1.charAt(i-1)=='(')
                {
                    ans+=1 << san;
                }
            }
        }
        return ans;
    }
}