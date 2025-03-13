import java.util.*;

class Solution {
    List<Integer> list = new ArrayList<Integer>();
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                list.add(i);
            }
        }
        for(int j=0; j<list.size(); j++){
            answer += list.get(j);
        }
        System.out.println(list);
        return answer;
    }
}