class Solution {
    public int maxDistToClosest(int[] seats) {
        int max = Integer.MIN_VALUE;
        int maxSeat =-1;
        for(int i = 0; i<seats.length;i++){
            if(seats[i]!=0){
                if(maxSeat == -1)
                max = i;
                else
                max = Math.max(max, (i - maxSeat)/2);
                maxSeat = i;
            }
        }
        max = Math.max(max, (seats.length - 1 - maxSeat));
        return(max);
    }
}
