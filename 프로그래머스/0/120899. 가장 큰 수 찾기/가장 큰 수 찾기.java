import java.lang.Math;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        
        for(int i: array){
            max = Math.max(max, i);
        }
        
        answer[0] = max;
        
        for(int i=0; i<array.length; i++){
            if(array[i] == max){
                answer[1] = i;
            }
        }
        
        return answer;
    }
}