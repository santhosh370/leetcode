class Solution {
    public int minChanges(String s1) {
        int n=s1.length();
        int count=0;

        for(int i=0;i<n;i+=2)
        {
            if(s1.charAt(i)!=s1.charAt(i+1))
            {
                count++;
            }
        }
        return count;
    }
}