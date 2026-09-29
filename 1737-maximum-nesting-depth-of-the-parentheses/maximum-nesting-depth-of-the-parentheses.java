class Solution {
    public int maxDepth(String s1) {
        int count=0;
        int max=0;

        for(char ch : s1.toCharArray())
        {
            if(ch=='(')
            {
                count++;
                max=Math.max(max,count);
            }
            else if(ch==')')
            {
                count--;
            }
        }
        return max;
    }
}