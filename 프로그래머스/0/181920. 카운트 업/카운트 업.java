class Solution {
    public int[] solution(int start_num, int end_num) {
        int end = end_num - start_num + 1;
        int[] answer = new int[end];
        
        for(int i=0; i<end; i++){
                answer[i] = start_num;
                start_num++;
        }
        return answer;
    }
}