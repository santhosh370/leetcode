class Solution {
    public int longestSubstring(String s1, int k) {
        int n=s1.length();
        if(s1.isEmpty() || s1.length() < k)
        {
            return 0;
        }

        int[]freq=new int[26];
        for(char ch:s1.toCharArray())
        {
            freq[ch-'a']++;
        }

        for(int i=0;i<n;i++)
        {
            if(freq[s1.charAt(i)-'a']<k)
            {
                int left=longestSubstring(s1.substring(0,i),k);
                int right=longestSubstring(s1.substring(i+1),k);
                return Math.max(left,right);

            }
        }
        return s1.length();
    }
}