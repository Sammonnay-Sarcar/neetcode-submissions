class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
        return 0;
        }
        HashSet<Integer> hSet = new HashSet<>();
        for(int i: nums){
            hSet.add(i);
        }
       int count ;
       int longest = 0;
        for(int i:nums){
            count = 0;
            if(!hSet.contains(i -1)){
                int x = i;
                while (hSet.contains(x++))
                    count++;
                longest = Math.max(longest, count);    
            }
        }
        return longest;
    }
}
