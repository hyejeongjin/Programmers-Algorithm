import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++){
            list.add(numbers[i]);
        }
        
        list.sort(Comparator.naturalOrder());
        answer = list.get(list.size()-1) * list.get(list.size()-2);
        
        return answer;
    }
}