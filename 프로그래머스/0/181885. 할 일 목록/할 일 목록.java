class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int count = 0;
        int a = 0;
        
        for(int j=0; j<finished.length; j++){
            if(finished[j] == false){
                count++;
            }
        }
        String[] answer = new String[count];
        
        for(int i=0; i<todo_list.length; i++){
            if(finished[i] == false){
                answer[a] = todo_list[i];
                a++;
            }
        }
        
        
        return answer;
    }
}