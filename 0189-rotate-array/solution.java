class Solution {
    public void rotate(int[] nums, int k) {
         k = k % nums.length; 
        if(k < 0){ 
            k += nums.length;
        }
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
     public static void reverse(int nums[], int i, int j){
        int li = i;
        int ri = j;
        
        while(li < ri){
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;
            
            li++;
            ri--;
        }
   
   
    // k = k % nums.length;
    // int[] res = new int[nums.length];
    // int x = 0;
    // for(int i = nums.length  - k; i<nums.length; i++){
    //     res[x] = nums[i];
    //     x++;
    // }
    // for(int i = 0; i<k-1; i++){
    //     res[x] = nums[i];
    //     x++;
    // }
    // System.out.println(res[3]);
    // nums = res;
    return;
    }
}
