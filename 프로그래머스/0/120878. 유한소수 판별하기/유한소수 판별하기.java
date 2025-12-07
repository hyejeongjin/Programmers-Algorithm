import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int gcd = getGCD(a, b);
        b = b / gcd;
        
        while(b % 2 == 0){
            b /= 2;
        }       
        while(b % 5 == 0){
            b /= 5;
        }
        
        if(b == 1){
            answer = 1;
        }
        if(b != 1){
            answer = 2;
        }

        return answer;
    }
    
    private int getGCD(int n, int m){
        while(m != 0){
            int temp = n % m;
            n = m;
            m = temp;
        }
        return n;
    }
}