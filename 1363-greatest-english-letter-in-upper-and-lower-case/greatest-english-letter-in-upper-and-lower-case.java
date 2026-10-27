class Solution {
    public String greatestLetter(String s1) {
        boolean[]lower_case=new boolean[256];
        boolean[]upper_case=new boolean[256];

        for(char ch:s1.toCharArray())
        {
            if(ch>='a' && ch<='z')
            {
                lower_case[ch-'a']=true;
            }
            else if(ch>='A' && ch<='Z')
            {
                upper_case[ch-'A']=true;
            }
        }
        for(int i=25;i>=0;i--)
        {
            if(lower_case[i] && upper_case[i])
            {
                return String.valueOf((char)(i+'A'));
            }
        }
        return "";
    }
}