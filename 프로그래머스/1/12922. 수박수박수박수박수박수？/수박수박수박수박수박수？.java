class Solution {
    public String solution(int n) {
        String answer = "";
        String water = "수박";
        
        for(int i=0; i<n; i++){
            if(n % 2 == 0){
                answer = water.repeat(n/2);
            }else{
                answer = water.repeat(n/2) + water.substring(0,1);
            }
        }
        return answer;
    }
}