import java.util.*;

class Solution {
    boolean solution(String s) {
        String S = s.toUpperCase();
        String[]SList = S.split("");
        ArrayList<String> plist = new ArrayList();
        ArrayList<String> ylist = new ArrayList();
        
        for(int i=0; i<s.length(); i++) {
            if(SList[i].equals("P")) plist.add(SList[i]);
            else if(SList[i].equals("Y")) ylist.add(SList[i]);
        }
        
        if(plist.size() == ylist.size()) return true;

        return false;
    }
}