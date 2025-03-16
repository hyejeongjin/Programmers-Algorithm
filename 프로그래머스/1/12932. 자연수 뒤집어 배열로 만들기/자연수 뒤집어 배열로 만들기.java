import java.util.*;
class Solution {
    public List<Integer> solution(long n) {
        String n2 = Long.toString(n);
        String[] list = n2.split("");
        
        List<Integer> arrList = new ArrayList<>();
        
        
        for(int i=list.length-1; i >= 0; i--){
            arrList.add(Integer.parseInt(list[i]));
           
        }
        
        return arrList;
    }
}