class Solution {
    public int[] findErrorNums(int[] nums) {
         int l = nums.length;
        int[] res = new int[2];
        boolean[] seen = new boolean[10001];

        int sum=0;
        for (int num : nums) {
            if (seen[num]) {
                res[0] = num;
            }
            seen[num] = true;
            sum += num;
        }
        res[1] = (l*(1+l)/2) - sum + res[0];
        return res;
    }
}
