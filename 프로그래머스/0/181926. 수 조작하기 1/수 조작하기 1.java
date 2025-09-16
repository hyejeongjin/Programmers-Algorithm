class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        for(int i=0; i<control.length(); i++){
            if(String.valueOf(control.charAt(i)).equals("w")){
                n = n + 1;
            }else if(String.valueOf(control.charAt(i)).equals("s")){
                n = n - 1;
            }else if(String.valueOf(control.charAt(i)).equals("d")){
                n = n + 10;
            }else{
                n = n - 10;
            }
        }
        answer = n;
        return answer;
    }
}