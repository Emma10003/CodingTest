import java.util.*;

class Solution {
    public long solution(long n) {
        String num = Long.toString(n);
        String[] strarr = num.split("");
        Arrays.sort(strarr);
        
        String str = "";
        
        for(int i=num.length()-1; i>=0; i--) {
            str += strarr[i];
        }
        return Long.parseLong(str);
    }
}