class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hSet = new HashSet<>();
        for(int x : nums){
            if(!hSet.add(x)){
                return true;
            }
        }
        return false;
    }
}