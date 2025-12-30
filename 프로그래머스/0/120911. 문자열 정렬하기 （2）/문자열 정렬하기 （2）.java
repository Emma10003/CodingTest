import java.util.*;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        String[] strlist = my_string.split("");
        String answer = "";
        
        Arrays.sort(strlist);
        
        for(int i=0; i<strlist.length; i++) {
            answer += strlist[i];
        }
        
        return answer;
    }
}