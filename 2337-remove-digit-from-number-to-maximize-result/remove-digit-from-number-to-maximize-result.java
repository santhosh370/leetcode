class Solution {
    public String removeDigit(String s1, char ch) {
        int n=s1.length();
        String s2="";
        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i)==ch)
            {
                String sub=s1.substring(0,i)+s1.substring(i+1);
                if(sub.compareTo(s2)>0)
                {
                    s2=sub;
                }
            }
        }
        return s2;
    }
}