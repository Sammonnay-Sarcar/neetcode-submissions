class Solution {
    public int reverse(int x) {
        long result =0;
        int copy = Math.abs(x);
        while(copy != 0){
            result  = result*10 + (copy%10);
            copy = copy/10;
        }
        if(result<Integer.MIN_VALUE || result > Integer.MAX_VALUE){
            return 0;
        }else if(x<0){
            return (int)(-1 * result);
        }else{
            return (int)result;
        }
    }
}
