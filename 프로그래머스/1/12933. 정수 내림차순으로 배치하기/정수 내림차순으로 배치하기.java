import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        List<Integer> arr = new ArrayList<>();
        
         while(n > 0){
             arr.add(Long.valueOf(n % 10).intValue());
             n /= 10;
         }
        Collections.sort(arr, Collections.reverseOrder());
        String change = "";
        
        for(int i=0; i<arr.size(); i++){
            change += arr.get(i);
        }
        answer = Long.parseLong(change);
        
        return answer;
    }
}