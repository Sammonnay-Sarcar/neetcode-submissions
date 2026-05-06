class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int counter = 0;
        for(int i : nums){
            if(i!=0){
                counter++;
            }else{
                max = Math.max(max,counter);
                counter = 0;
            }
        }
        if(nums[nums.length-1]==1){
            max = Math.max(max,counter);
        }
        return max;
    }
}
