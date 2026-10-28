class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] arr = new int[s.length()];

        for(int[] shift : shifts) {
            if(shift[2] == 1) {
                arr[shift[0]] += 1;
                if(shift[1]+1 < s.length()) {
                    arr[shift[1]+1] -=1;
                }
            } else {
                arr[shift[0]] -= 1;
                if(shift[1]+1 < s.length()) {
                    arr[shift[1]+1] +=1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for(int i=0; i<s.length(); i++) {
            sum = (sum + arr[i]) % 26;
            
            if(sum < 0) sum += 26;

            char sc = (char) ('a' + ((s.charAt(i) - 'a' + sum) % 26));
            sb.append(sc);
        }
        return sb.toString();
    }
}