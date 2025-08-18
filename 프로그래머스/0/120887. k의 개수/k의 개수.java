class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String num = "";
        
        for(int n = i; n <= j; n++){
            num = String.valueOf(n);
            for(char c : num.toCharArray()){
                if(c == (char)(k + '0')){
                    answer++;
                }
            }
        }
        return answer;
    }
}