class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int americano = money / 5500;
        int exchange = money % 5500;
        
        answer[0] = americano;
        answer[1] = exchange;
        
        
        return answer;
    }
}