import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(int i=0; i<a.length(); i++){
            char temp = a.charAt(i);
            if(temp >= 97 && temp <= 122){
                answer += a.valueOf(temp).toUpperCase();
            }
            if(temp <= 95 && temp >= 65){
                answer += a.valueOf(temp).toLowerCase();
            }
        }
        System.out.println(answer);
    }
}