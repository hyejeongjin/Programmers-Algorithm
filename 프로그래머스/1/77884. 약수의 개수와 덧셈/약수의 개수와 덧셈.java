import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int sq = 0;
        int sqrt = 0;
        
        for(int i = left; i<= right; i++){
            sqrt = (int) Math.sqrt(i);
            if(sqrt * sqrt == i){
                sq += i;
            }else{
                answer += i;
            }
        }
        answer = answer - sq;
        return answer;
    }
}