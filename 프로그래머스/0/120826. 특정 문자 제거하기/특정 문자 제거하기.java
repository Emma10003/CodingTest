class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] stringList = my_string.split("");
        for(int i=0; i<my_string.length(); i++) {
            if(stringList[i].equals(letter)) answer += "";
            else answer += stringList[i];
        }
        return answer;
    }
}