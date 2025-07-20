class Solution {
    public String solution(String my_string) {
        String answer = "";
        char temp;
        
        for(int i=0; i<my_string.length(); i++){
            temp = my_string.charAt(i);
            if(temp >= 97 && temp <= 122){
                answer += my_string.valueOf(temp).toUpperCase();
            }
            if(temp <= 95 && temp >= 65){
                answer += my_string.valueOf(temp).toLowerCase();
            }
        }
        
        return answer;
    }
}