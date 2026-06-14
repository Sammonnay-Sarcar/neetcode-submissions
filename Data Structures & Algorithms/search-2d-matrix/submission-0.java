class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        int verticalMid = 0;
        while (top <= bottom) {
            verticalMid = top + (bottom - top) / 2;
            if (target < matrix[verticalMid][0]) {
                bottom = verticalMid-1;
            } else if (target > matrix[verticalMid][n - 1]) {
                top = verticalMid+1;
            } else {
                break;
            }
        }
        if (!(top <= bottom)) {
            return false;
        }
        while (left <= right) {
            int horizontalMid = left + (right - left) / 2;
            if (target < matrix[verticalMid][horizontalMid]) {
                right = horizontalMid-1;
            } else if (target > matrix[verticalMid][horizontalMid]) {
                left = horizontalMid+1;
            } else {
                return true;
            }
        }
        return false;
    }
}
