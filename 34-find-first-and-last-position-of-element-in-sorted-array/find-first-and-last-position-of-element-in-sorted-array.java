class Solution {
    public static int Left(int[] nums,int target){
        int l =0;
        int r=nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]>=target){
                r =mid-1;
            }else{
                l = mid+1;
        }
       
    }
    if(l>=nums.length){
        return -1;
    }if(nums[l] != target){
        return -1;
    }
    return l;
        
    }
    public static int Right(int[] nums,int target){
        int l =0;
        int r=nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]>target){
                r =mid-1;
            }else{
                l = mid+1;
        }
       
    }
    if(r<0){
        return -1;
    }
    if(nums[r] != target){
        return -1;
    }
    return r;
        
    }
    public int[] searchRange(int[] nums, int target) {
        int ans1 = Left(nums,target);
        int ans2 = Right(nums,target);
        int[] ans = {ans1,ans2};
        return ans;
    }
    }