class Solution {
    public String removeOuterParentheses(String s1) {
        StringBuilder sb=new StringBuilder();
        int n= s1.length();

        int count=0;
        for(int i=0;i<n;i++)
        {
            char ch=s1.charAt(i);

            if(ch=='(')
            {
                if(count>0)
                {
                    sb.append(ch);
                }
                count++;
            }
            else
            {
                count--;

                if(count>0)
                {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}