class Solution {
    public static int Left(int[] nums,int target){
        int left =0;
        int right=nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]>=target){
                right =mid-1;
            }else{
                left = mid+1;
        }
       
    }
    if(left>=nums.length){
        return -1;
    }if(nums[left] != target){
        return -1;
    }
    return left;
        
    }
    public static int Right(int[] nums,int target){
        int left =0;
        int right=nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]>target){
                right =mid-1;
            }else{
                left = mid+1;
        }
       
    }
    if(right<0){
        return -1;
    }
    if(nums[right] != target){
        return -1;
    }
    return right;
        
    }
    public int[] searchRange(int[] nums, int target) {
        int ans1 = Left(nums,target);
        int ans2 = Right(nums,target);
        int[] ans = {ans1,ans2};
        return ans;
    }
    }