class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        int maxCandy = 0;

        for (int candy : candies) {
            sum += candy;
            maxCandy = Math.max(maxCandy, candy);
        }
        if (sum < k) {
            return 0;
        }

        int low = 1;
        int high = maxCandy;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalChildren = 0;
            for (int candy : candies) {
                totalChildren += candy / mid;
            }

            if (totalChildren >= k) {
                ans = mid;     
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }

        return ans;
    }
}