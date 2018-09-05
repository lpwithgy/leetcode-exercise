class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        int h = 0;
        int w = 0;
        while(left<right){
            w = right-left;
            if(height[left]<height[right]){
                h = height[left];
                left++;
            }
            else{
                h = height[right];
                right--;
            }
            max = Math.max(w*h,max);
        }
        
        return max;
    }
}