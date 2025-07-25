import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int a = 0;
        
        Arrays.sort(num_list);
        
        for(int i=0; i<5; i++){
            answer[a++] = num_list[i];
        }
        return answer;
    }
}