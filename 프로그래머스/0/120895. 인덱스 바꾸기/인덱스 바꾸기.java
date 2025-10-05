class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        Character first = my_string.charAt(num1);
        StringBuilder sb = new StringBuilder(my_string);
        sb.setCharAt(num1, sb.charAt(num2));
        sb.setCharAt(num2, first);
        answer = sb.toString();
        
        return answer;
    }
}