class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        int product = nums[0];
        for(int i = 1; i< nums.length;i++){
            res[i] = product;
            product *= nums[i];
        }
        //nums = [1,2,4,6]
        //res = [1,1,2,8]
        product = nums[nums.length - 1];
        for(int i = nums.length -2; i>=0; i--){
            res[i] *= product;
            product *= nums[i];
        }
        //res = [1,1,2,8]
        //res = [48,24,12,8]
        return res;
    }
}  
