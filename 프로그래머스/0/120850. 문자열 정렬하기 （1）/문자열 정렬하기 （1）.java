import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String answer = "";
        String[] stringList = my_string.split("");
        
        for(int i=0; i<my_string.length(); i++) {
            if(stringList[i].charAt(0) <= '9') answer += stringList[i];
        }
        
        String[] newlist = answer.split("");
        int[] intList = new int[newlist.length];
        
        for(int i=0; i<newlist.length; i++) {
            intList[i] = Integer.parseInt(newlist[i]);
        }
        Arrays.sort(intList);
        
        return intList;
    }
}