import java.util.*;

class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] charlist = myString.toCharArray();
        
        for(int i=0; i<charlist.length; i++) {
            if(charlist[i] <= 'l') charlist[i] = 'l';
        }
        
        for(int i=0; i<charlist.length; i++){
            answer += String.valueOf(charlist[i]);
        }
        
        return answer;
    }
}