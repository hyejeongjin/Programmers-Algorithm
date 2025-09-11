class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int a = 0;
        
        for(int i=0; i<strArr.length; i++){
            if(i % 2 == 0){
                answer[a] = strArr[i].toLowerCase();
                a++;
            }else{
                answer[a] = strArr[i].toUpperCase();
                a++;
            }
        }
        
        return answer;
    }
}