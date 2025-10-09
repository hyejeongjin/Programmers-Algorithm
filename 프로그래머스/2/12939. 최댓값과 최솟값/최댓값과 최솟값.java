import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int[] list = Arrays.stream(s.split(" "))
                   .mapToInt(Integer::parseInt)
                   .toArray();
        
        Arrays.sort(list);
        answer = list[0] + " " + list[list.length - 1];
        
        return answer;
    }
}