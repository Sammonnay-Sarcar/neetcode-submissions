class Solution {
    public int jump(int[] nums) {
       if(nums.length == 1){
           return 0;
       }
       int currReach = 0, jumps = 0, prevReach = 0;
       for(int i = 0; i< nums.length; i++){
           currReach = Math.max(currReach, i + nums[i]);
           if(currReach >= nums.length - 1){
               return jumps+1;
           }
           if(i == prevReach){
               jumps++;
               prevReach = currReach;
           }
       }
       return jumps;
   }
}
