import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        List<String> list = new ArrayList<>();
        String[] arr = s.split("");
        
        for(int i = 0; i<arr.length; i++){
            list.add(arr[i]);
        }
        System.out.println(list);
        
        for(int j=0; j<list.size(); j++){
           if(s.length() % 2 == 0){
               answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
           }else{
               answer = list.get(list.size() / 2);
           }
        }
        
        
        return answer;
    }
}