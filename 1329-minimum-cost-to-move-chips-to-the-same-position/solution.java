class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCounter = 0;
        int oddCounter = 0;
        for(int i : position){
            if(i%2 ==0){
                evenCounter++;
            }else{
                oddCounter++;
            }
        }
        return (Math.min(evenCounter, oddCounter));
    }
}
