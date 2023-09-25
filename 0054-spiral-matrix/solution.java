class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> answer = new ArrayList<>();

        int row = matrix.length;
        int column = matrix[0].length;

        int startRow = 0;
        int endRow = row - 1;
        int startColumn = 0;
        int endColumn = column - 1;
        while(startRow <= endRow && startColumn <= endColumn){
           for (int j = startColumn; j <= endColumn; j++) {
                answer.add(matrix[startRow][j]);
            }

            for(int i = startRow+1; i<=endRow; i++){
                answer.add(matrix[i][endColumn]);
            }
            if (startRow < endRow) {
                for (int j = endColumn - 1; j >= startColumn; j--) {
                    answer.add(matrix[endRow][j]);
                }
            }
            if (startColumn < endColumn) {
                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    answer.add(matrix[i][startColumn]);
                }
            }
            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }
        return answer;
    }
}
