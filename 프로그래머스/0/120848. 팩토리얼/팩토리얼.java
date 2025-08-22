class Solution {
    public int solution(int n) {
        int answer = 0;
        int fact = 1;
        int i = 1;
        
        while(fact <= n){
            i++;
            fact *= i;
            if(fact > n){
                break;
            }
        }      
        answer = i-1;
        return answer;
    }
}