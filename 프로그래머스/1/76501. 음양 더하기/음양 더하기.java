class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int minus = 0;
        int plus = 0;
        
        for(int i=0; i<absolutes.length; i++){
            if(signs[i] == false){
                minus += absolutes[i] * -1;
            }else{
                plus += absolutes[i];
            }
            answer = minus + plus;
        }
        
        return answer;
    }
}