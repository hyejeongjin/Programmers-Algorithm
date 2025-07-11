class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int a = 0;
        
        for(int i=0; i<strlist.length; i++){
            answer[a++] = strlist[i].length();
        }
        
        return answer;
    }
}