class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;
        int even = 0;
        
        // odd
        for(int i=0; i<num_list.length; i++){
            odd += num_list[i];
            i++;
        }
        // even
        for(int i=1; i<num_list.length; i++){
            even += num_list[i];
            i++;
        }
        
        if(odd > even){
            answer = odd;
        }else{
            answer = even;
        }
        
        return answer;
    }
}