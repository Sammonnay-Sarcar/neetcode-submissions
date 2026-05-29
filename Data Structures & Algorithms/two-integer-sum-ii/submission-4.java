class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0,rightPointer = numbers.length -1;
        while(leftPointer < rightPointer){
            if(numbers[leftPointer]+numbers[rightPointer] < target){
                leftPointer++;
            }else if(numbers[leftPointer]+numbers[rightPointer] > target){
                rightPointer--;
            }else{
                return new int[]{leftPointer+1,rightPointer+1};
            }
        }
        return new int[2];
    }
}
