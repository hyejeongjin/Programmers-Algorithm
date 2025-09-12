import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] blist = new String[before.length()];
        String[] alist = new String[after.length()];
        
        
        for(int i=0; i<before.length(); i++){
            blist[i] = String.valueOf(before.charAt(i));
            alist[i] = String.valueOf(after.charAt(i));
        }
        
        Arrays.sort(blist);
        Arrays.sort(alist);
        
        for(int j=0; j<before.length(); j++){
            if(!blist[j].equals(alist[j])){
                answer = 0;
                break;
            }else{
                answer = 1;
            }
        } 
        return answer;
    }
}