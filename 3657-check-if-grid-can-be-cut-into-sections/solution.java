class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        int hCount = 0;
        int vCount = 0;
        int maxHeight = 0;
        int maxWidth = 0;
        Arrays.sort(rectangles, Comparator.comparingInt(a -> a[1]));
        for(int i = 0;i<rectangles.length-1; i++){
            maxHeight = Math.max(maxHeight,rectangles[i][3]);
            if(rectangles[i+1][1]>=maxHeight){
                hCount++;
                if(hCount ==2){
                    return true;
                }
            }
        }
        Arrays.sort(rectangles, Comparator.comparingInt(a -> a[0]));
        for(int i = 0;i<rectangles.length-1; i++){
            maxWidth = Math.max(maxWidth,rectangles[i][2]);
            if(rectangles[i+1][0]>=maxWidth){
                vCount++;
                if(vCount ==2){
                    return true;
                }
            }
        }
        return false;
    }
}
