class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int san = k;
        while (set.contains(san)) {
            san += k;
        }

        return san;
    }
}