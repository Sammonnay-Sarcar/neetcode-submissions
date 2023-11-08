class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int D = Math.max(Math.abs(fx-sx), Math.abs(fy - sy));//Chebyshev distance
        return D>0 ? D<= t : t!=1;
    }
}
