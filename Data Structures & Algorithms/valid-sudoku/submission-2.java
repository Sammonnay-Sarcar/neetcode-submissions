class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][10];
        boolean[][] col = new boolean[9][10];
        boolean[][] box = new boolean[9][10];
        for(int i = 0; i< 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j]!='.'){
                    int val = board[i][j] - '0';
                    int boxLoc = (i/3)*3 + (j/3);
                    if(row[i][val] || col[j][val] || box[boxLoc][val] ){
                        return false;
                    }
                    row[i][val] = true;
                    col[j][val] = true;
                    box[boxLoc][val] = true;
                }
            }
        }
        return true;
    }
}
