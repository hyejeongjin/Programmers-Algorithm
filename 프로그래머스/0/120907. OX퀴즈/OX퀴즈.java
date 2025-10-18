class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String[] que = quiz[i].split(" ");
            int num1 = Integer.parseInt(que[0]);
            int num2 = Integer.parseInt(que[2]);
            int result = Integer.parseInt(que[4]);
            
            if(que[1].equals("+")){
                answer[i] = (num1 + num2 == result) ? "O" : "X" ;
            }else{
                answer[i] = (num1 - num2 == result) ? "O" : "X" ;
            }
        }
        return answer;
    }
}