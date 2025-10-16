import java.lang.Math;
import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int max = Integer.MAX_VALUE;
        
        Arrays.sort(array);
        
        for(int i=0; i<array.length; i++){
            if(Math.abs(n - array[i]) < max){
                answer = array[i];
                max = Math.abs(n - array[i]);
            }
        }
        return answer;
    }
}