class Solution {
    public int maximumStrongPairXor(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int j = 0;
            while(i+j<nums.length && Math.abs(nums[i] - nums[i+j]) <= Math.min(nums[i], nums[i+j])){
                max = Math.max(max, nums[i]^nums[i+j]);
                j++;
            }   
        }
        return max ;
    }
}
