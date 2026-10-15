class Solution {
    public boolean canConstruct(String s1, String s2) {
        if (s1.length() > s2.length())
        {
             return false;
        }
        int[] alphabets_counter = new int[26];
        
        for (char c : s2.toCharArray())
        {
            alphabets_counter[c-'a']++;

        }

        for (char c : s1.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) 
            {
                return false;

            }
            alphabets_counter[c-'a']--;
        }
        return true;
    }
}