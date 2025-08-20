class Solution {
    public String solution(String myString) {
        return myString.replaceAll(myString, myString.toUpperCase());
    }
}