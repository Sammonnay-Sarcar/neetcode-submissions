class Solution {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int n = aliceValues.length;
        int[][] values = new int[n][2];
        for(int i= 0; i<n;i++){
            values[i] = new int[]{aliceValues[i], bobValues[i]};
        }
        int x= 0,y= 0;
        Arrays.sort(values, (a,b)-> (b[1]+b[0]) - (a[1]+a[0]));
        for(int i = 0;i<n;i++){
            if(i%2 == 0){
                x+= values[i][0];
            }
            else{
                y+= values[i][1];
            }
        }
        return Integer.compare(x,y);
    }
}
