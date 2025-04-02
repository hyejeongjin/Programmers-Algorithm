import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String chk = "";
        List<String> list = new ArrayList<>();
        
        list = Arrays.asList(s.split(""));
        Collections.sort(list);
        Collections.reverse(list);
        for(int i=0; i<list.size(); i++){
           answer += list.get(i);
        }
        
        return answer;
    }
}