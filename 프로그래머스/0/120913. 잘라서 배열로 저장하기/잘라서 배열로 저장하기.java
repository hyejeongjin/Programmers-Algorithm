import java.lang.Math;

class Solution {
    public String[] solution(String my_str, int n) {
        // String[] answer = my_str.split("(?<=\\G.{" + n + "})");
        int size = (my_str.length() + n - 1) / n;
        String[] answer = new String[size];
        
        int a = 0;
        for(int i=0; i<my_str.length(); i += n){
            answer[a++] = my_str.substring(i, Math.min(i+n, my_str.length()));
        }
        return answer;
    }
}