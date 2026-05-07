class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
       boolean[] arr = new boolean[nums.length+1];
       Arrays.fill(arr,false);
       for(int i = 0;i<nums.length;i++){
        arr[nums[i]]=true;
       }
       for(int i = 1;i<=nums.length;i++){
        if(!arr[i]){
            res.add(i);
        }
       }
       return res;
    }
}
