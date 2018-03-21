class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int num = 0;
        if(nums.length < 1){
            return 0;
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 1){
                num += 1; 
            }
            else{
                max = Math.max(max,num);
                num = 0;
            }        
        }
        max = Math.max(max,num);
        return max;
    }
}