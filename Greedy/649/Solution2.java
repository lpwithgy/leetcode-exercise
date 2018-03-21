class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> queue = new LinkedList<>();
        int[] people =  new int[2];
        int[] bans = new int[2];
        for(char ch : senate.toCharArray()){
            int p = ch == 'R'?0:1;
            people[p]++;
            queue.add(p);
        }
        while(people[0]>0 && people[1]>0){
            int p = queue.poll();
            if(bans[p]==0){
                people[p^1]--;
                bans[p^1]++;
                queue.add(p);
            }
            else{
                bans[p]--;
            }
        }
        return people[0] == 0 ? "Dire":"Radiant";
    }
}