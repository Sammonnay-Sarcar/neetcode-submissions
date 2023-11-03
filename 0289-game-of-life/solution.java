class Solution {
    public void gameOfLife(int[][] board) {
        int []dx = {-1,-1,-1,0,0,1,1,1};
        int []dy = {-1,0,1,-1,1,-1,0,1};
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                int alive = 0;
                for(int offset = 0; offset<8; offset++){
                    int x = i - dx[offset];
                    int y = j - dy[offset];
                    if(x>=0 && x < board.length && y>=0 && y < board[0].length && (board[x][y] == 1 || board[x][y] == 2) ){
                        alive++;
                    }
                }
                if(board[i][j]==1 && (alive<2 || alive>3))
                board[i][j] = 2;//2 ->dead in next stage
                else if(board[i][j] ==0 && alive == 3)
                board[i][j] = 3; //3 -> alive in next stage
            }
        }
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] == 2)
                board[i][j] = 0;
                else if(board[i][j] == 3){
                    board[i][j] = 1;
                }
            }
        }
    }
}
