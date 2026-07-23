class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[]arr=new int[256];
        Arrays.fill(arr,-1);

        int max=0;
        int min=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(arr[ch]>=min) {
                min=arr[ch]+1;
            }
            arr[ch]=i;
            max=Math.max(max,i-min+1);
          
        }
        return max;
    }
    
    
}