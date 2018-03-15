class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int columns = nums[0].length;
        if(rows*columns != r*c){
            return nums;
        }
        int[][] reNums = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                reNums[i][j] = nums[(int)((i*c+j)/columns)][(i*c+j)%columns];
            }
        } 
        return reNums;       
    }
}