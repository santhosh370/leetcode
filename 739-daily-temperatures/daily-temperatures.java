class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n=nums.length;
        int[]arr=new int[n];

        Stack<Integer>stack=new Stack<>();

        for(int i=0;i<n;i++)
        {

            while(!stack.isEmpty() && nums[i]>nums[stack.peek()])
            {
                int san=stack.pop();
                arr[san]=i-san;
            }
            stack.push(i);
        }
        return arr;
    }
}