class Solution {
    private int count = 0;
    private int num = 1;
    public int countArrangement(int N) {
        num = N;
        boolean[] visited = new boolean[N+1];
        permute(visited,1);
        return count;
    }
    
    private void permute(boolean[] visited,int pos){
        if(pos>num){
            count++;
            return;
        }
        for(int i=1;i<=num;i++){
            if(!visited[i] &&(i%pos == 0 || pos%i == 0)){
                visited[i] = true;
                permute(visited,pos+1);
                visited[i] = false;
            }
        }
    }
}