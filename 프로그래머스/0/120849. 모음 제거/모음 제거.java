class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] vowel = {"a", "i", "o","e", "u"};
        
        for(int i=0; i<vowel.length; i++){
            if(my_string.contains(vowel[i])){
                my_string = my_string.replace(vowel[i], "");
            }
            
        }
        answer = my_string;
        return answer;
    }
}