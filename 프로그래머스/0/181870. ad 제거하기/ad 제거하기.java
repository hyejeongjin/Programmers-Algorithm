import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        // 1. List의 remove() 메서드를 이용한 방법
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
        
        // 2. Stream을 이용한 방법
        //return Arrays.stream(strArr).filter(str -> !str.contains("ad")).toArray(String[]::new);
    }
}

