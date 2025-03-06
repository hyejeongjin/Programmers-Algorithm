class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        double div = (double) num1/num2;
        answer = div * 1000;
        return (int) answer;
    }
}