class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        sol(nums, freq, res, temp);
        return res;
    }
    void sol(int[] nums, boolean[] freq, List<List<Integer>> res, List<Integer> temp){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }else{
            for(int i = 0; i<nums.length; i++){
                if(freq[i]!= true){
                    freq[i] = true;
                    temp.add(nums[i]);
                    sol(nums, freq, res, temp);
                    temp.remove(temp.size() - 1);
                    freq[i] = false;
                }
            }
        }
    }
}
