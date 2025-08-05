class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 6;
        int gcd = getGCD(pizza, n);
        
        answer = n / gcd;
        
        return answer;
    }
    
    public static int getGCD(int pizza, int n){
        if(pizza % n == 0){
            return n;
        }
        return getGCD(n, pizza%n);
    }
    
}