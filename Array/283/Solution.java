class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        boolean flag = true;
        for(int i = 0;i<nums.length;i++){
            if(flag){
                if(nums[i] == 0){
                    flag = false;
                    index = i;
                }
            }
            else{
                if(nums[i]!=0)
                    nums[index++] = nums[i];
            }
        }
        if(!flag){
            for(int i = index;i<nums.length;i++){
                nums[i] = 0;
            }
        }
    }
}