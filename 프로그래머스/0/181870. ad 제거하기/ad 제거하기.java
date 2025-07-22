import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> list = new ArrayList<String>(Arrays.asList(strArr));
        
        answer = strArr;
        
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                list.remove(strArr[i]);
                answer = list.toArray(new String[0]);
            }
        }
        return answer;
    }
}