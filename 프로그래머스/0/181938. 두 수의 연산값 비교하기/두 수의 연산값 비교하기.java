class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String plus = "";
        
        plus = Integer.toString(a) + Integer.toString(b);
        
        if(Integer.parseInt(plus) > 2 * a * b){
            answer = Integer.parseInt(plus);
        }else{
            answer = 2 * a * b;
        }
        
        
        return answer;
    }
}