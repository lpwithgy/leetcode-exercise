class Solution {
    public int[] constructArray(int n, int k) {
        int[] result = new int[n];
        int index = 0;
        int start = 1;
        int add = k;
        for(;index<=k;index++){
            result[index] = start;
            if(index == k){
                index++;
                break;
            }
            result[++index] = start + add;
            start +=1;
            add -= 2;
        }
        for(int i = index;i<n;i++){
            result[i] = i+1;
        }
        return result;
    }
}