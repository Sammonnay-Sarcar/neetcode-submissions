class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hSet = new HashSet<>();
        if(nums == null || nums.length<2 || k==0)
        return false;
        int i =0;
        for(int j = 0; j<nums.length; j++){
            if(!hSet.add(nums[j]))
            return true;
            if(hSet.size() > k)
            hSet.remove(nums[i++]);
        }
        return false;
    }
}
