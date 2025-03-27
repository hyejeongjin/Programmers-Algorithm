import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int all = 45;
        
        for(int i = 0; i<numbers.length; i++){
            answer += numbers[i];  
        }
        answer = all - answer;  
        return answer;
    }
}