class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length -1;
        int[] res = new int[2];
        while(leftPointer < rightPointer){
            int currSum = numbers[leftPointer]+numbers[rightPointer];
            if(currSum < target){
                leftPointer++;
                continue;
            }else if(currSum > target){
                rightPointer--;
                continue;
            }else{
                res[0]=leftPointer+1;
                res[1]=rightPointer+1;
                return res;
            }
        }
        return new int[]{0,0};
    }
}
