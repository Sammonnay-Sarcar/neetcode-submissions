class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int complement = target - nums[i];
            if(hMap.get(complement)!=null){
                return new int[]{hMap.get(complement),i};
            }else{
                hMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}