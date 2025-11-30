import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String number = s;
        
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        for(Map.Entry<String, String> entry : map.entrySet()){
            number = number.replace(entry.getKey(), entry.getValue());
        }
        answer = Integer.parseInt(number);
        
        return answer;
    }
}