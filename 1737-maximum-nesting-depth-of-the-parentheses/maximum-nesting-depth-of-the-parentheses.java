class Solution {
    public int maxDepth(String s1) {
        int depth=0;
        int max=0;

        for(char ch : s1.toCharArray())
        {
            if(ch == '(')
            {
                depth++;
                max=Math.max(max,depth);
            }
            else if(ch == ')')
            {
                depth--;
            }
        }
        return max;
    }
}