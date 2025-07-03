class Solution {
    public int[] solution(int n) {
        int count = 0;
        
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                count++;
            }
        }
        
        int[] answer = new int[count];
        int a = 0;
        
        for(int j=1; j<=n; j++){
            if(j % 2 != 0){
                answer[a] = j; 
                a++;
            }
        }      
        
        return answer;
    }
}