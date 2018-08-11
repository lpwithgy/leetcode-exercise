class Solution {
    int count = 0;
    public int countArrangement(int N) {
        int[] nums = new int[N];
        for(int i =1;i<=N;i++){
            nums[i-1] = i;
        }
        permute(nums,0);
        return count;
    }
    
    private void permute(int[] nums,int start){
        if(start == nums.length)
            count++;
        for(int i = start;i<nums.length;i++){
            swap(nums,start,i);
            if(nums[start]%(start+1) == 0 || (start+1)%nums[start] == 0)
                permute(nums,start+1);
            swap(nums,start,i);
        }
    }
    
    private void swap(int[] nums,int x,int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}