class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
    int left = 0, right = 0;
    long maxCount = 0, currentSum = 0;
    while (right < nums.length) {
        currentSum += nums[right];
        while (nums[right] * (right - left + 1L) > currentSum + k) {
            currentSum -= nums[left];
            left++;
        }
        maxCount = Math.max(maxCount, right - left + 1);
        right++;
    }

    return (int)maxCount;
    }
}
