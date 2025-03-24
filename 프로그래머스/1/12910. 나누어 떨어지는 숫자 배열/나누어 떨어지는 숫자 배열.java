import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> check = new ArrayList<>();
        int[] answer = {-1};
        
        for(int i=0; i<arr.length; i++){
            // divisor로 나누어 떨어지는 값.
            if(arr[i] % divisor == 0){
                check.add(arr[i]);
                }
            }
        if(check.size() != 0){
            answer = new int[check.size()];
            for(int j=0; j<check.size(); j++){   
                answer[j] = check.get(j).intValue();
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}