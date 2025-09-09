class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String num = "";
        
        for(int i=0; i<array.length; i++){
            num = String.valueOf(array[i]);
            for(char c : num.toCharArray()){
                if(c == (char)('7')){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}