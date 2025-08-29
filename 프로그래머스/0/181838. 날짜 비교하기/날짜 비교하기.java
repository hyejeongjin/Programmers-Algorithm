class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        for(int i = 0; i < 3; i++){
            if(date1[0] < date2[0]){ //년도가 앞설 경우
                answer = 1;
            }
            else if(date1[0] == date2[0]){ // 년도가 같을 경우
                if(date1[1] < date2[1]){ // 월이 앞설 경우
                    answer = 1;
                }else if(date1[1] == date2[1]){
                    if(date1[2] < date2[2]){ // 일이 앞설 경우
                        answer = 1;
                    }   
                }
            }
            
        }
        
        return answer;
    }
}