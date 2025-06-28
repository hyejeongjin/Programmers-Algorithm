class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if(price >= 100000 && price < 300000){
            answer = (int) Math.floor(price-(price * 0.05));
            System.out.println(answer);
        } else if(price >= 300000 && price < 500000){
            answer = (int) Math.floor(price-(price * 0.1));
            System.out.println(answer);
        }else if(price >= 500000){
            answer = (int) Math.floor(price-(price * 0.2));
            System.out.println(answer);
        }else {
            answer = price;
        }
        
        return answer;
    }
}