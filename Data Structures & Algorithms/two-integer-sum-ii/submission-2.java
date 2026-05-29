class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length -1;
        while(leftPointer < rightPointer){
            int currSum = numbers[leftPointer]+numbers[rightPointer];
            if(currSum < target){
                leftPointer++;
            }else if(currSum > target){
                rightPointer--;
            }else{
                return new int[]{leftPointer+1,rightPointer+1};
            }
        }
        return new int[]{0,0};
    }
}
