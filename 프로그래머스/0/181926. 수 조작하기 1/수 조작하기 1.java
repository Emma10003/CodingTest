import java.util.*;

class Solution {
    public int solution(int n, String control) {
        String[] controlList = control.split("");
        
        for(int i=0; i<control.length(); i++) {
            if(controlList[i].equals("w")) n++;
            else if(controlList[i].equals("s")) n--;
            else if(controlList[i].equals("d")) n += 10;
            else n -= 10;
        }
        
        return n;
    }
}