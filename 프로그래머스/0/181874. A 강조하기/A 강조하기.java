import java.util.*;
class Solution {
    public String solution(String myString) {
        String answer = "";        
        String temp = "a";
        
        myString = myString.toLowerCase();
        answer = myString.replace(temp, temp.toUpperCase());
        
        return answer;
    }
}