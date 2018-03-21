class Solution {
    int[][] grid;
    boolean[][] counted;
    int rows = 0;
    int cols = 0;
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        rows = grid.length;
        cols = grid[0].length;
        int max = 0;
        int area = 0;
        counted = new boolean[rows][cols];
        for(int i = 0; i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(grid[i][j]==1){
                    area = areaOfIsland(i,j);
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }
    
    private int areaOfIsland(int i,int j){
        if(i<0 || j<0 || i>rows-1 || j>cols-1 || counted[i][j] || grid[i][j] == 0 )
            return 0;
        counted[i][j] = true;
        return 1+areaOfIsland(i,j-1)+areaOfIsland(i,j+1)+areaOfIsland(i-1,j)+areaOfIsland(i+1,j);
            
    }
      
}
    