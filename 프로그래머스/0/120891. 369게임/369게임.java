class Solution {
    public int solution(int order) {
        int answer = 0;
        String game = String.valueOf(order);
        
        for(int i=0; i<game.length(); i++){
            if(String.valueOf(game.charAt(i)).contains("3") || 
               String.valueOf(game.charAt(i)).contains("6") || 
               String.valueOf(game.charAt(i)).contains("9")){
                answer++;
            }
        }
        
        return answer;
    }
}