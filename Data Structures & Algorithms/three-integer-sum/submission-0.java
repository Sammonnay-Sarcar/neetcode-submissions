class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
       Arrays.sort(nums);
       int x;
       for(int i = 0; i < nums.length;i++){
            x = nums[i];
            if(x>0){
                break;
            }
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while(l<r){
                if(x + nums[l] + nums[r] > 0){
                    r--;
                }else if(x + nums[l] + nums[r] < 0){
                    l++;
                }else{
                    resList.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
       }
       return resList;
    }
}
