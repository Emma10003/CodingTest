import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String strN = String.valueOf(n);
        
        String[] strlist = strN.split("");
        
        for(int i=0; i<strlist.length; i++) {
            answer += Integer.parseInt(strlist[i]);
        }
        
        return answer;
    }
}