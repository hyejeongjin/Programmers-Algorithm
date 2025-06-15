class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int discount = 0;
        
        if(n >= 10){
           discount = (n / 10) * 2000;
        }
        answer = n * 12000 + k * 2000 - discount;
        return answer;
    }
}