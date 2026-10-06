class Solution {
    public int minSwaps(String s1) {
        Stack<Integer>stack=new Stack<>();
        int n=s1.length();
        int not_match=0;
        
        for(int i=0;i<n;i++)
        {
            char ch=s1.charAt(i);

            if(ch=='[')
            {
                stack.push(i);
            }
            else
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
                else
                {
                    not_match++;
                }
            }
        }
        return (not_match+1) / 2;
    }
}