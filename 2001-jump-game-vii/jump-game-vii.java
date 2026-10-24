class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();

        if (s.charAt(n - 1) == '1') {
            return false;
        }

        int[] diff = new int[n + 1];
        diff[0] = 1;
        diff[1] = -1;

        int reachable = 0;

        for (int i = 0; i < n; i++) {
            reachable += diff[i];

            if (reachable == 0 || s.charAt(i) == '1') {
                continue;
            }

            int start = i + minJump;
            int end = Math.min(i + maxJump, n - 1);

            if (start < n) {
                diff[start] += 1;
                if (end + 1 < n) {
                    diff[end + 1] -= 1;
                } else {
                    return true; // Early exit: wave covers the last index
                }
            }
        }

        return reachable > 0;
    }
}