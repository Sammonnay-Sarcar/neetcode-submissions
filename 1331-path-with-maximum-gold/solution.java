class Solution {
    int max= 0;
    public int getMaximumGold(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for(int i= 0;i<row;i++){
            for(int j= 0;j<col;j++){
                if(grid[i][j]!=0)
                    DFS(i,j,grid,0);
            }
        }
        return (max);
    }
    public void DFS(int i, int j, int[][] grid, int sum){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0){
            max = Math.max(max,sum);
            return;
        }
        int val = grid[i][j];
        grid[i][j] = 0;
        DFS(i+1,j,grid,sum+val);
        DFS(i,j+1,grid,sum+val);
        DFS(i-1,j,grid,sum+val);
        DFS(i,j-1,grid,sum+val);
        grid[i][j]=val;
    }
}
