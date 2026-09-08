class Solution {
    public String removeDuplicateLetters(String s1) {
        int[]freq=new int[26];
        boolean[]arr=new boolean[26];

        for(char ch:s1.toCharArray())
        {
            freq[ch-'a']++;
        }

        Stack<Character>stack=new Stack<>();

        for(char ch:s1.toCharArray())
        {
            freq[ch-'a']--;

            if(arr[ch - 'a'])
            {
                continue;
            }

            while(!stack.isEmpty() && stack.peek()>ch && freq[stack.peek()-'a']>0)
            {
                char removed=stack.pop();
                arr[removed - 'a']=false;

            }
            stack.push(ch);
            arr[ch-'a']=true;
        }

        StringBuilder sb=new StringBuilder();

        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }

       return sb.reverse().toString();
    }
}