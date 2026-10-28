class Solution {
    public long shiftDistance(String s, String t, int[] nextCost, int[] previousCost) {
        if (s.equals(t)) return 0;
        
        int n = s.length();
        long totalDistance = 0;

        for (int i = 0; i < n; i++) {
            char sc = s.charAt(i), tc = t.charAt(i);

            if (sc == tc) continue; 

            int start = sc - 'a';
            int end = tc - 'a';

            long clockwiseCost = 0;
            for (int j = start; j != end; j = (j + 1) % 26) {
                clockwiseCost += nextCost[j];
            }

            long counterClockwiseCost = 0;
            for (int j = start; j != end; j = (j - 1 + 26) % 26) {
                counterClockwiseCost += previousCost[j];
            }

            totalDistance += Math.min(clockwiseCost, counterClockwiseCost);
        }

        return totalDistance;            
    }
}