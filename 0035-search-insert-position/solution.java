class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1, mid ;
        while(left<=right){
            mid = left+(right - left)/2;
            if(target>nums[mid]){
                left = mid+1;
            }else if(target<nums[mid]){
                right = mid-1;
            }else if(target == nums[mid]){
                return mid;
            }
        }
        return(left);
    }
}
