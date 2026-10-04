class Solution {
    public boolean checkValidString(String s1) {
        int left=0,right=0;

        for(char ch:s1.toCharArray())
        {
            if(ch=='(')
            {
                left++;
                right++;
            }
            else if(ch==')')
            {
                left--;
                right--;
            }
            else
            {
                left--;
                right++;
            }

            if(right<0)
            {
                return false;
            }
            if(left<0)
            {
                left=0;
            }
        }
        return left==0;
    }
}