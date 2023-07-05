class Solution {
    public int hIndex(int[] citations) {
        int[] count = new int[citations.length+2];
        for(int i = citations.length-1; i>=0;i--){
            count[Math.min(citations[i], citations.length)]++;
        }
        int h;
        for(h = citations.length; h>=0;h--){
            count[h] += count[h+1];
            if(count[h]>=h){
                break;
            }
        }
        return(h);
    }
}
