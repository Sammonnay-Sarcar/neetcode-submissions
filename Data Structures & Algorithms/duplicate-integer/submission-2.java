class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hSet = new HashSet<>();
        for(int i:nums){
            if(!hSet.add(i)){
                return true;
            }
        }
        return false;
    }
}