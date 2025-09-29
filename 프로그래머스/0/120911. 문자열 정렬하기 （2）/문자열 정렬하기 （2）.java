import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        Character[] arr = new Character[my_string.length()];
        
        for(int i=0; i<my_string.length(); i++){
            arr[i] = my_string.charAt(i);
        }
        
        Arrays.sort(arr);
        
        for(int j=0; j<arr.length; j++){
            answer += arr[j];
        }
        
        return answer;
    }
}