class Solution {
    public String longestNiceSubstring(String s1) {
        int n=s1.length();
        String s2="";

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                String sub=s1.substring(i,j);

                if(nice(sub))
                {
                    if(sub.length() > s2.length())
                    {
                        s2=sub;
                    }
                }
            }
        }
        return s2;
    }

    public boolean nice(String sub)
    {
        Set<Character>set=new HashSet<>();

        for(char ch:sub.toCharArray())
        {
            set.add(ch);
        }

        for(char ch:sub.toCharArray())
        {
            char lower = Character.toLowerCase(ch);
            char upper = Character.toUpperCase(ch);

            if(!set.contains(lower) || !set.contains(upper))
            {
                return false;
            }
        }
        return true;
    }
}