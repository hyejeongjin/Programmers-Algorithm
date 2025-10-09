import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // int[] list = Arrays.stream(s.split(" "))
        //            .mapToInt(Integer::parseInt)
        //            .toArray();
        
        String[] arr = s.split(" ");
        int[] list = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            list[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(list);
        answer = list[0] + " " + list[list.length - 1];
        
        return answer;
    }
}