class Solution {
    public String removeStars(String s1) {
        StringBuilder sb=new StringBuilder();
        int n=s1.length();
        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i) == '*')
            {
                sb.deleteCharAt(sb.length()-1);
            }
            else
            {
                sb.append(s1.charAt(i));
            }
        }
        return sb.toString();
    }
}