import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        //제곱근
        long num = (long) Math.sqrt(n);
        
        if(n == Math.pow(num, 2)){
            answer = (long) Math.pow(num+1, 2);
        }
        else{
            answer = -1;
        }
        return answer;
    }
}