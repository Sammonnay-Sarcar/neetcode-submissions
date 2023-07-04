class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int first = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != val){
                int temp = nums[first];
                nums[first] = nums[i];
                nums[i] = temp;
                first++;
            }
        }
        return(first);
    }
}
