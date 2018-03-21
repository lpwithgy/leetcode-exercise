class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalDuration = 0;
        int start = -1;
        int end = start;
        for(int i = 0; i<timeSeries.length;i++){
            if(timeSeries[i] <= end)
                end =  timeSeries[i] + duration;
            else{
                totalDuration += end - start;
                start = timeSeries[i];
                end = start+duration;
            }        
        }
        totalDuration += end - start;
        return totalDuration;
    }
}