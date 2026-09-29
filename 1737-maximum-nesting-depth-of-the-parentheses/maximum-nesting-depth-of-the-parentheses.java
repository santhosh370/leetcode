class Solution {
    public int maxDepth(String s1) {
        Stack<Character>stack=new Stack<>();

        int max=0;
        for(char ch:s1.toCharArray())
        {
            if(ch=='(')
            {
                stack.push(ch);
                max=Math.max(max,stack.size());
            }
            else if(ch==')')
            {
                stack.pop();
            }
        }
        return max;
    }
}