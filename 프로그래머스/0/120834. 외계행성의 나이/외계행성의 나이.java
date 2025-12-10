import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        char[] list = Integer.toString(age).toCharArray();
        
        for(int i=0; i<list.length; i++){
            char c = (char) (list[i] - 48 + 97);

            answer += c;
        }
    
        return answer;
    }
}