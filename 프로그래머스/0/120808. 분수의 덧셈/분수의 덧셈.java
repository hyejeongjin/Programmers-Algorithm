class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        // answer[0] = 분자, answer[1] = 분모
        if(denom1 > denom2){
            // 분모가 배수일 경우
           if(denom1 % denom2 == 0){
               answer[0] = numer1 + numer2 * (denom1 / denom2);
               answer[1] = denom1;
           }else{
               answer[0] = numer1 * denom2 + numer2 * denom1;
               answer[1] = denom1 * denom2;
           }
        }else if(denom1 < denom2){
            // 분모가 배수일 경우
           if(denom2 % denom1 == 0){
               answer[0] = numer2 + numer1 * (denom2 / denom1);
               answer[1] = denom2;
           }else{
               answer[0] = numer1 * denom2 + numer2 * denom1;
               answer[1] = denom1 * denom2;
           }
        }
        else{
            answer[0] = numer1 + numer2;
            answer[1] = denom1;
        }
        
        int gcd = getGCD(answer[0], answer[1]);
        answer[0] /= gcd;
        answer[1] /= gcd;
        
        
        
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