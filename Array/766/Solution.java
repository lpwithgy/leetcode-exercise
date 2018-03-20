class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows =  matrix.length;
        int columns = matrix[0].length;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                if(i+1 < rows && j+1 <columns){
                    if(matrix[i][j] != matrix[i+1][j+1]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}