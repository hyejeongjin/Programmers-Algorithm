import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(num > 0){
            arr.add(0, num % 10);
            num /= 10;
        }
        if(arr.contains(k)){
            answer = arr.indexOf(k)+1;
        }else{
            answer = -1;
        }
        
        return answer;
    }
}