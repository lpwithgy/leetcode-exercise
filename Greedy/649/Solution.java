class Solution {
    public String predictPartyVictory(String senate) {
        int size = senate.length();
        int[] votes =  new int[size];
        int index = 0;
        int sign = -1;
        for(char ch : senate.toCharArray()){
            votes[index] = (ch == 'R')? 0 : 1;
            index++;
        }
        int i = 0;
        while(true){
            if(votes[i]!=-1){
                if(!ban(i,votes[i]^1,votes,size)){
                    sign = votes[i];
                    break;
                }
            }
            i = i==size-1 ? 0:i+1; 
        }
        
        return sign == 0 ? "Radiant":"Dire";
    }
    
    private boolean ban(int index,int value,int[] votes,int size){
        //int value =  val==1 ? 0:1;
        for(int i=index+1;i<size;i++){
            if(votes[i] == value){
                votes[i] = -1;
                return true;
            }   
        }
        for(int i = 0;i<index;i++){
            if(votes[i] == value){
                votes[i] = -1;
                return true;
            }   
        }
        return false;
    }
}