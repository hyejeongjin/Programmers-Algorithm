import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        int min = arr[0];
        
        if(arr.length <= 1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            for(int i=0; i<arr.length; i++){
                min = Math.min(min, arr[i]);
                list.add(arr[i]);
            }
            
            list.remove(Integer.valueOf(min));
            answer = new int[list.size()];
            
            for(int j=0; j<list.size(); j++){
                answer[j] += list.get(j);
            }
        }
        return answer;
        
    }
}