class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> numsList = Arrays.stream(nums)
                                        .boxed()
                                        .collect(Collectors.toList());
        int[] result = new int[2];
        for(int i =0; i<nums.length;i++){
            int foundIndex = numsList.indexOf(target-nums[i]);
            if(foundIndex == i){
                foundIndex +=1;
                int newIndex=numsList.subList(foundIndex,numsList.size())
                                        .indexOf(target - nums[i]);
                if(newIndex <0){
                    continue;
                }
                foundIndex += newIndex;   
                System.out.println(foundIndex);                  
            }
            if(foundIndex>=0 && (numsList.get(foundIndex)+numsList.get(i) == target)){
                result[0] = numsList.indexOf(nums[i]);
                result[1] = foundIndex;
                break;
            }
        }                              
        return result;  
    }
}
