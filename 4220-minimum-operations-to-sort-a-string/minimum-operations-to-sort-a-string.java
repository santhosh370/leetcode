class Solution {
    public int minOperations(String s1) {
        int n=s1.length();
        char mx='a',mn='z';
         boolean a=true;
        for(int i=0;i< n; i++) {
            mx = (char) Math.max(mx, s1.charAt(i));
            mn = (char) Math.min(mn, s1.charAt(i));
            if (i > 0 && s1.charAt(i - 1) > s1.charAt(i)) {
                a= false;
            }
        }
        if(a){
            return 0;
        }
        if(n==2){
            return -1;
        }
        if(s1.charAt(0)==mn||s1.charAt(n-1)==mx){
            return 1;
        }
        for(int i=1;i<n-1;i++){
            if(s1.charAt(i)==mn||s1.charAt(i)==mx){
            return 2;
         }
        }
        return 3;
    }
        
}
