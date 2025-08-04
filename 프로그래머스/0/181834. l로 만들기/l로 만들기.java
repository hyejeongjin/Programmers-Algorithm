class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i=0; i<myString.length(); i++){
             if(myString.charAt(i) < 108 && myString.charAt(i) >= 97){
              myString = myString.replace(String.valueOf(myString.charAt(i)), "l");
            }
        }
        answer = myString;
        return answer;
    }
}