class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String[] num = Integer.toString(x).split("");
        int div = 0;
        
        for(int i=0; i<num.length; i++){
            div += Integer.parseInt(num[i]);
        }   
        
        if(x % div != 0){
                answer = false;
            }
        
        return answer;
    }
}