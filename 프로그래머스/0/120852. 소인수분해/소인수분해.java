import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=2; i<=n; i++){
            while(n % i == 0){
                n /= i;
                list.add(i);
            }
            if(n == 1){
                break;
            }
        }
        list = list.stream().distinct().collect(Collectors.toList());
        int[] answer = new int[list.size()];
        
        for(int j=0; j<list.size(); j++){
            answer[j] = list.get(j);
        }
                                            
        return answer;
    }
}