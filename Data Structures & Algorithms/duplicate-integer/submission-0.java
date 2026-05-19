class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = Arrays.stream(nums)
                                    .boxed()
                                    .collect(Collectors.toSet());
        System.out.println(numSet.size());
        return numSet.size() != nums.length;
    }
}