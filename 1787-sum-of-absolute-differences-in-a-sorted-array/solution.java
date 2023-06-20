class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result = new int[nums.length];
        int sumBelow = 0, sumAbove = 0, totalSum;
        for(int i : nums){
            sumAbove += i;
        }
        for(int i = 0 ; i<nums.length; i++){
            sumAbove = sumAbove - nums[i];
            sumBelow = sumBelow + nums[i];
            totalSum = Math.abs((i+1)*nums[i] - sumBelow)+Math.abs((nums.length - i - 1)*nums[i] - sumAbove);
            result[i] = totalSum;
        }
        return(result);
    }
}
