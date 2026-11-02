class Solution {
    public int minMoves2(int[] nums) {
    Arrays.sort(nums);
	int san = 0;
    int mid = nums[nums.length/2];
	for (int num: nums) 
    {
        san += Math.abs(mid - num);
    }
	return san;
    }
}