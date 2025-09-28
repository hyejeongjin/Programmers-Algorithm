import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        Map<String, String> num = new HashMap<>();
        num.put("zero", "0");
        num.put("one", "1");
        num.put("two", "2");
        num.put("three", "3");
        num.put("four", "4");
        num.put("five", "5");
        num.put("six", "6");
        num.put("seven", "7");
        num.put("eight", "8");
        num.put("nine", "9");
        
        
        for (Map.Entry<String, String> entry : num.entrySet()) {
            while(numbers.contains(entry.getKey())){
                numbers = numbers.replace(entry.getKey(), entry.getValue());
            }
        }
        answer = Long.parseLong(numbers);
        
        return answer;
    }
}