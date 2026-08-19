class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hSet = new HashSet<>();
        for(int n:nums){
            hSet.add(n);
        }
        int longest = 0;
        for(Integer n:hSet){
            if(!hSet.contains(n-1)){
                int length = 0;
                while(hSet.contains(n+length)){
                    length++;
                }
                longest = Math.max(length,longest);
            }
        }
        return longest;
    }
}
